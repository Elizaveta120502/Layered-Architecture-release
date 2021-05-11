package by.htp.libraryproject.dao.impl;

import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.dao.BookDAO;
import by.htp.libraryproject.dao.exception.DAOException;
import by.htp.libraryproject.dao.factory.DAOFactory;


public class SQLBookDAO implements BookDAO {
	
	

	@Override
	public void AddBook(Book book) throws DAOException {
 
		try {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		BookDAO bookDAO = daoObjectFactory.getBookDAO();
		bookDAO.AddBook(book);
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}


	@Override
	public void deleteBook(Book book) throws DAOException{

		
		try {
			DAOFactory daoObjectFactory = DAOFactory.getInstance();
		
		BookDAO bookDAO = daoObjectFactory.getBookDAO();
		bookDAO.deleteBook(book);
	} catch (Exception e) {
		throw new DAOException(e);
	}
	}

	@Override
	public boolean MarkAsRead(String dataBook)throws DAOException {
		
		try{
			String [] dataArray;
		
		String mark;
		
		dataArray=dataBook.split("/");
		mark = dataArray[6];
		if (mark.equals("true")) {
			return true;
		}
		else {
			return false;
		}
	} catch(Exception e) {
		throw new DAOException (e);
	}
		
		

	}

	@Override
	public boolean AddToFavourites(String dataBook)throws DAOException {
		
	     try {   String [] dataArray;
			
			String favourite;
			
			dataArray = dataBook.split("/");
			favourite = dataArray[5];
			
			if (favourite.equals("true")) {
				return true;
			}
			else {
				return false;
			}
	     }catch(Exception e) {
	    	 throw new DAOException(e);
	     }

	}
	
	@Override 
	
    public boolean getAccessForChildren(String dataBook)throws DAOException {
		
		try{
			String [] dataArray;
		
		
		String childrenAccess;
		
		dataArray = dataBook.split("/");
		childrenAccess = dataArray[4];
		
		if (childrenAccess.equals("true")) {
			return true;
		}
		else {
			return false;
		}
	} catch (Exception e) {
		throw new DAOException (e);
	}
		
	}
 
}
