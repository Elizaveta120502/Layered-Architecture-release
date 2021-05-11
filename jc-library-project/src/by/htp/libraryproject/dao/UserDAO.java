package by.htp.libraryproject.dao;

import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.dao.exception.DAOException;

public interface UserDAO {

	String signIn(String login, String password) throws DAOException;

	User getUserByLogin(String login)throws DAOException;


	boolean addUser(User user) throws DAOException;

	void deleteUser(User user) throws DAOException;
	


	
}
