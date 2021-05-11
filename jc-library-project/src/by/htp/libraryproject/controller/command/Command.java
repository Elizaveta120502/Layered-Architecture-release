package by.htp.libraryproject.controller.command;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.service.exception.ServiceException;

public interface Command {

	public String execute(String request) ;

	String execute(String request, Book book) throws ServiceException;

	String execute(String request, User user);


}
