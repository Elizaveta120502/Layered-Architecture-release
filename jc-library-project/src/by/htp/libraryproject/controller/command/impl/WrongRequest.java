package by.htp.libraryproject.controller.command.impl;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.controller.command.Command;
import by.htp.libraryproject.service.exception.ServiceException;

public class WrongRequest implements Command {

	@Override
	public String execute(String request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String request, Book book) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String request, User user) {
	
		return request;
	}

}
