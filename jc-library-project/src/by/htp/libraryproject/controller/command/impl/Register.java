package by.htp.libraryproject.controller.command.impl;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.controller.command.Command;
import by.htp.libraryproject.service.exception.ServiceException;

public class Register implements Command {

	@Override
	public String execute(String request) {

		return request;
	}

	@Override
	public String execute(String request, Book book) throws ServiceException {

		return request;
	}

	@Override
	public String execute(String request, User user) {

		return request;
	}
}
