package by.htp.libraryproject.service;


import by.htp.libraryproject.service.exception.ServiceException;

public interface SearchService {
	
    String searchBookByPublishingHouse(String publishing) throws ServiceException;
	
	String searchBookByAuthor(String author) throws ServiceException;
	
	String searchBookByTitle(String title) throws  ServiceException;

}
