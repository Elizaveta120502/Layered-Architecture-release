package by.htp.libraryproject.dao;

import by.htp.libraryproject.dao.exception.DAOException;

public interface BookSearchDAO {

	String searchBookByPublishingHouse(String publishing) throws DAOException;
	
	String searchBookByAuthor(String author) throws DAOException;
	
	String searchBookByTitle(String title) throws DAOException;
	
}
