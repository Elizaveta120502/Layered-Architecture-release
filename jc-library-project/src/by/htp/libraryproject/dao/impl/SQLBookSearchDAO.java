package by.htp.libraryproject.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import by.htp.libraryproject.dao.BookSearchDAO;
import by.htp.libraryproject.dao.exception.DAOException;

public class SQLBookSearchDAO implements BookSearchDAO {

	private static final String SEARCH_PATH = "BookUser/Books.txt";

	public String searchBookByTitle(String title) throws DAOException {

		File bookDataSourse = new File("BookUser/Books.txt");
		BufferedReader reader = null;

		String books = null;

		try {

			reader = new BufferedReader(new FileReader(bookDataSourse));
			String bookData = null;

			while ((bookData = reader.readLine()) != null) {

				if (findNecessaryBooks(bookData, title, 1)) {
					books = books + getBook(bookData) + "\n";

				}

				if (books.length() == 0) {
					return "\n Books not found";
				} else {
					return "\n Results of searching:\n" + books;
				}
			}
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new DAOException(e);
				}
			}
		}
		return books;

	}

	@Override
	public String searchBookByPublishingHouse(String publishing) throws DAOException {

		File bookDataSourse = new File(SEARCH_PATH);
		BufferedReader reader = null;

		String books = " ";

		try {

			reader = new BufferedReader(new FileReader(bookDataSourse));
			String bookData = null;

			while ((bookData = reader.readLine()) != null) {

				if (findNecessaryBooks(bookData, publishing, 9)) {
					books = books + getBook(bookData) + "\n";

				}

				if (books.length() == 0) {
					return "\n Books not found";
				} else {
					return "\n Results of searching:\n" + books;
				}
			}
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new DAOException(e);
				}
			}
		}
		return books;
	}

	@Override
	public String searchBookByAuthor(String author) throws DAOException {
		File bookDataSourse = new File(SEARCH_PATH);
		BufferedReader reader = null;

		String books = " ";

		try {

			reader = new BufferedReader(new FileReader(bookDataSourse));
			String bookData = null;

			while ((bookData = reader.readLine()) != null) {

				if (findNecessaryBooks(bookData, author, 1)) {
					books = books + getBook(bookData) + "\n";

				}

				if (books.length() == 0) {
					return "\n Books not found";
				} else {
					return "\n Results of searching:\n" + books;
				}
			}
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new DAOException(e);
				}
			}
		}
		return books;
	}

	boolean findNecessaryBooks(String bookData, String characteristic, int locationInArray) {

		String[] arrayBookData;
		String point;

		arrayBookData = bookData.split("/");
		point = arrayBookData[locationInArray];

		if (characteristic.equals(point)) {
			return true;
		} else {
			return false;
		}

	}

	String getBook(String bookData) {

		String[] arrayBookData;
		String information = "";

		arrayBookData = bookData.split("/");

		for (int i = 0; i < 10; i++) {
			information = information + arrayBookData[i] + " - ";
		}

		information = information.substring(0, information.length() - 3);
		return information;
	}
}
