package by.htp.libraryproject.controller.command.impl;


import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.controller.command.Command;
import by.htp.libraryproject.service.LibraryService;
import by.htp.libraryproject.service.exception.ServiceException;
import by.htp.libraryproject.service.factory.ServiceFactory;

public class AddBook implements Command {

	@Override
	public String execute(String request, Book book) throws ServiceException {

		String response;
	

		ServiceFactory serviceProvider = ServiceFactory.getInstance();
		LibraryService libraryService = serviceProvider.getLibraryService();

		try {
			response = libraryService.addNewBook(book);;
		} catch (ServiceException e) {
			response = "Error of adding.Try again.";
		}
		return response;
	}

	@Override
	public String execute(String request) {
	
		return request;
	}

	@Override
	public String execute(String request, User user) {
		
		return request;
	}

	

}
