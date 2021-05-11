package by.htp.libraryproject.service.impl;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.dao.BookDAO;
import by.htp.libraryproject.dao.factory.DAOFactory;
import by.htp.libraryproject.service.LibraryService;
import by.htp.libraryproject.service.exception.ServiceException;

public class LibraryServiceImpl implements LibraryService {

	
	public static DAOFactory daoFactory = DAOFactory.getInstance();
	public static BookDAO BookDAO = daoFactory.getBookDAO();
	
	@Override
	public String addNewBook(Book book) throws ServiceException {
     try {
    	 BookDAO.AddBook(book);
     } catch (Exception e) {
    	 throw new ServiceException(e);
     }
		return null;
	}

	@Override
	public String deleateBook(Book book) throws ServiceException {
		 try {
	    	 BookDAO.deleteBook(book);
	     } catch (Exception e) {
	    	 throw new ServiceException(e);
	     }
			return null;
		}
	}

	
