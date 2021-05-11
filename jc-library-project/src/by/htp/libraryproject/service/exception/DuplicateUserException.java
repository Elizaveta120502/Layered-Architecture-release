package by.htp.libraryproject.service.exception;

public class DuplicateUserException extends RuntimeException {
	  private static final long serialVersionUID = 1L;

	  public DuplicateUserException() {
	    super();
	  }

	  public DuplicateUserException(String message) {
	    super(message);
	  }

	  public DuplicateUserException(Exception e) {
	    super(e);
	  }

	  public DuplicateUserException(String message, Exception e) {}
	}