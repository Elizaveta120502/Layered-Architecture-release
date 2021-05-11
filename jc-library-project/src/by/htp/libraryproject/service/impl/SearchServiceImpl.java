package by.htp.libraryproject.service.impl;

import by.htp.libraryproject.dao.exception.DAOException;
import by.htp.libraryproject.dao.factory.DAOFactory;
import by.htp.libraryproject.dao.impl.SQLBookSearchDAO;
import by.htp.libraryproject.service.SearchService;
import by.htp.libraryproject.service.exception.ServiceException;

public class SearchServiceImpl implements SearchService {

	public static DAOFactory daoFactory = DAOFactory.getInstance();
	public static SQLBookSearchDAO booksearchDAO = daoFactory.getSQLBookSearchDAO();

	@Override

	public String searchBookByAuthor(String author) throws ServiceException {

		final String patternAuthor = "(^[a-zA-Z])";

		if (!author.matches(patternAuthor)) {
			throw new ServiceException("Author not Found.Try again.");
		}

		String books = " ";

		try {

			books = booksearchDAO.searchBookByAuthor(author);
		} catch (DAOException e) {
			throw new ServiceException("Author not found");
		}

		return books;
	}

	@Override

	public String searchBookByTitle(String title) throws ServiceException {

		final String patternTitle = "((^[A-Z0-9])([^(à-ÿÀ-ÿ)])";

		if (!title.matches(patternTitle)) {
			throw new ServiceException("Book title not Found.Try again.");
		}

		String books = " ";

		try {

			books = booksearchDAO.searchBookByTitle(title);
		} catch (DAOException e) {
			throw new ServiceException("Title not found");
		}

		return books;
	}

	public String searchBookByPublishingHouse(String publishing) throws ServiceException {

		final String patternPublishing = "((^[A-Z0-9])([^(à-ÿÀ-ÿ)])";

		if (!publishing.matches(patternPublishing)) {
			throw new ServiceException("Book title not Found.Try again.");
		}

		String books = " ";

		try {

			books = booksearchDAO.searchBookByTitle(publishing);
		} catch (DAOException e) {
			throw new ServiceException("Publishing House not found");
		}

		return books;
	}

}
