package by.htp.libraryproject.service.impl;

import by.htp.libraryproject.bean.User;


import by.htp.libraryproject.dao.UserDAO;
import by.htp.libraryproject.dao.exception.DAOException;
import by.htp.libraryproject.dao.factory.DAOFactory;
import by.htp.libraryproject.service.ClientService;
import by.htp.libraryproject.service.exception.DuplicateUserException;
import by.htp.libraryproject.service.exception.ServiceException;
import by.htp.libraryproject.service.exception.UserPresenceException;

public class ClientServiceImpl implements ClientService {

	public static DAOFactory daoFactory = DAOFactory.getInstance();
	public static UserDAO userDAO = daoFactory.getUserDAO();

	
	@Override
	public String signIn(User user,String login,String password) throws ServiceException {

		if (user.getPassword().length() > 4) {

			try {
				if (userDAO.getUserByLogin(user.getLogin()) == null) {
					userDAO.addUser(user);
				} else {
					throw new DuplicateUserException("User with such login: '" + user.getLogin() + "' already exists.");
				}
				
				String role = "undefined";
				role = userDAO.signIn(login, password);
			} catch (DAOException e) {
				throw new ServiceException(e);
			}
		} else {
			throw new ServiceException("Enter more than 4 symbols");
		}
		return password;
		

	}

	public User findUser(String login, String password) throws ServiceException, UserPresenceException {

		User user;

		try {
			user = userDAO.getUserByLogin(login);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		if (user != null) {
			if (!user.getPassword().equals(password)) {
				throw new ServiceException("Incorrect password.Try again.");
			}
		} else {
			throw new UserPresenceException("No user with such login: " + login);
		}
		return user;
	}


  
    @Override
	public void getUserByLogin(String login) throws ServiceException {
		User user;
	  try {
			user = userDAO.getUserByLogin(login);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

	}

}
