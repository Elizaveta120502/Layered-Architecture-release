package by.htp.libraryproject.service.exception;

public class UserPresenceException extends Exception {

	 private static final long serialVersionUID = 1L;

	  public UserPresenceException() {
	    super();
	  }

	  public UserPresenceException(String message) {
	    super(message);
	  }

	  public UserPresenceException(Exception e) {
	    super(e);
	  }

	  public UserPresenceException(String message, Exception e) {}
	}
