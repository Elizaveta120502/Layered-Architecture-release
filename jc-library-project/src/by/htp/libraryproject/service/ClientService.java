package by.htp.libraryproject.service;

import by.htp.libraryproject.bean.User;

import by.htp.libraryproject.service.exception.ServiceException;
import by.htp.libraryproject.service.exception.UserPresenceException;

public interface ClientService {

	User findUser(String login, String password) throws ServiceException, UserPresenceException;

	void getUserByLogin(String login) throws ServiceException;

	String signIn(User user, String login, String password) throws ServiceException;

}
