package by.htp.libraryproject.controller.command.impl;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.controller.command.Command;
import by.htp.libraryproject.service.SearchService;
import by.htp.libraryproject.service.exception.ServiceException;
import by.htp.libraryproject.service.factory.ServiceFactory;

public class SearchByTitle implements Command {

	@Override
	public String execute(String request) {
	
			
			String title;
			String response;
			
			title = request.substring(request.indexOf("title") + 7);

			if (title == null ||title.isEmpty()) {
				return "Unsuccessful request.Try again";
			}

			ServiceFactory serviceProvider = ServiceFactory.getInstance();
			SearchService searchService = serviceProvider.getSearchService();

			try {
				response = searchService.searchBookByAuthor(title);
			} catch (ServiceException e) {
				response = "Error during request";
			}

			return response;
		
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
