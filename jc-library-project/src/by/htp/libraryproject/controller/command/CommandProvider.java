package by.htp.libraryproject.controller.command;

import java.util.HashMap;

import java.util.Map;

import  by.htp.libraryproject.controller.command.impl.AddBook;
import by.htp.libraryproject.controller.command.impl.DeleateBook;
import by.htp.libraryproject.controller.command.impl.SearchByAuthor;
import by.htp.libraryproject.controller.command.impl.SearchByPublishing;
import by.htp.libraryproject.controller.command.impl.SearchByTitle;
import  by.htp.libraryproject.controller.command.impl.SignIn;
import by.htp.libraryproject.controller.command.impl.WrongRequest;



public final class CommandProvider {
	
	private final Map<CommandName, Command> repository = new HashMap<>();

	public CommandProvider() {
		repository.put(CommandName.SIGN_IN, new SignIn());
		repository.put(CommandName.ADD_BOOK, new AddBook());
		repository.put(CommandName.SEARCH_FOR_BY_AUTHOR, new SearchByAuthor());
		repository.put(CommandName.SEARCH_FOR_BY_TITLE, new SearchByTitle());
		repository.put(CommandName.SEARCH_FOR_BY_PUBLISHING, new SearchByPublishing());
		repository.put(CommandName.DELETE_BOOK, new DeleateBook());
		repository.put(CommandName.WRONG_REQUEST, new WrongRequest());

	}

	public Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;
		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {

			command = repository.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}
}
	