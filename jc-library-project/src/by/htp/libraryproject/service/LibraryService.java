package by.htp.libraryproject.service;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.service.exception.ServiceException;

public interface LibraryService {

	String addNewBook(Book book)throws ServiceException;

	String deleateBook(Book book)throws ServiceException;

	


	

}
