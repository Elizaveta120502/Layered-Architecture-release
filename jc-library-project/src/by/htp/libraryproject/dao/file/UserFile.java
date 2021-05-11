package by.htp.libraryproject.dao.file;

import java.io.IOException;
import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.dao.exception.DAOException;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class UserFile {

	private final File file = new File("BookUser/User.txt");

	public void writeToFile(User user) throws DAOException {

		try {
			int id = user.getUserid();

			int age = user.getAge();
			String login = user.getLogin();
			String password = user.getPassword();

			FileWriter fw;
			fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(id);
			bw.write(password);
			bw.write(age);
			bw.write(login);
			bw.close();
		} catch (IOException e) {
			throw new DAOException(e);
		}

	}

	public static void deleteFromFile(User user) throws DAOException {

		try {
			int id = user.getUserid();

			int age = user.getAge();
			String login = user.getLogin();
			String password = user.getPassword();
			 StringBuffer sb = new StringBuffer( id );
		      sb.delete(0,50); 
		      StringBuffer sb1 = new StringBuffer( login );
		      sb.delete(0,50); 
		      
		      StringBuffer sb2 = new StringBuffer( password );
		      sb.delete(0,50); 
		      
		      StringBuffer sb3 = new StringBuffer( age );
		      sb.delete(0,50); 
		      
		      
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}
}
