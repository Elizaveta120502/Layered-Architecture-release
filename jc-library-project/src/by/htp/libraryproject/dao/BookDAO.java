package by.htp.libraryproject.dao;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.dao.exception.DAOException;

public interface BookDAO {

	void AddBook(Book book)  throws DAOException;

	void deleteBook(Book book)  throws DAOException;

	boolean MarkAsRead(String dataBook) throws DAOException;

	boolean AddToFavourites(String dataBook) throws DAOException;

	boolean getAccessForChildren(String dataBook) throws DAOException;

}
