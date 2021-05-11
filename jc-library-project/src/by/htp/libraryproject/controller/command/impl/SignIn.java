package by.htp.libraryproject.controller.command.impl;



import by.htp.libraryproject.bean.Book;
import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.controller.command.Command;
import by.htp.libraryproject.service.ClientService;
import by.htp.libraryproject.service.exception.ServiceException;
import by.htp.libraryproject.service.factory.ServiceFactory;

public class SignIn implements Command {

	
	@Override
	public String execute(String request,User user ) {
		String login = null;
		String password = null;
		String response = null;


		login = request.substring(request.indexOf("login") + 6, request.indexOf(' ', request.indexOf("login")));
		password = request.substring(request.indexOf("password") + 9);

		if (login == null || login.isEmpty()) {
			return "Login cann't be null";
		}

		if (password == null || password.isEmpty()) {
			return "Password cann't be null";
		}

		ServiceFactory serviceProvider = ServiceFactory.getInstance();
		ClientService clientService = serviceProvider.getClientService();

		try {

			response = "Welcome " + clientService.signIn(user, login, password) + "!";

		} catch (ServiceException e) {

			response = "Error during login procedure";
		}
		return response;
	}

	@Override
	public String execute(String request, Book book) throws ServiceException {
		
		return request;
	}

	@Override
	public String execute(String request) {
		// TODO Auto-generated method stub
		return null;
	}
}
