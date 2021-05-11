package by.htp.libraryproject.view;

import by.htp.libraryproject.controller.Controller;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to library!You can find  there many interesting books.Let's start.");

		Controller controller = new Controller();

		String user = controller.executeTask("SIGN_IN Elizabeth/vaogn0707");
		String searchByAuthor = controller.executeTask("SEARCH_FOR_BY_AUTHOR author = Natalia Shcherba");

		String searchBookByPublishingHouse = controller.executeTask("SEARCH_FOR_BY_PUBLISHING Exmo");

		String searchBookByTitle = controller.executeTask("SEARCH_FOR_BY_TITLE title = Clock key");

		String book = "ADD_BOOK Natalia Shcherba/Clock heart";
		String add = controller.executeTask(book);
		
		String deleateBook = controller.executeTask("DELEATE_BOOK Stephen Howking/Theory of Everything");
		System.out.println(deleateBook);

	}
}
