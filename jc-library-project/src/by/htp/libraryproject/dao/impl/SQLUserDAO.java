package by.htp.libraryproject.dao.impl;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import by.htp.libraryproject.bean.User;
import by.htp.libraryproject.dao.UserDAO;
import by.htp.libraryproject.dao.exception.DAOException;
import by.htp.libraryproject.dao.file.UserFile;

public class SQLUserDAO implements UserDAO {

	private static final String USER_PATH = "BookUser/User.txt";
	
	private final UserFile userFile = new UserFile();
	

	@Override
	public String signIn(String login, String password) throws DAOException {
		
		File userDataSourse = new File (USER_PATH);
		BufferedReader reader = null;
		
		String age = "age not specified";
		
		try {
			reader = new BufferedReader(new FileReader(userDataSourse));
			String userData = null;
			while ((userData = reader.readLine()) != null) {

				if (userComparison(userData, login, password)) {
					age = getAge(userData);
					return age;
				}
			}
		} catch(IOException e){
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

		return age;

	}


	

	public boolean userComparison(String userData, String login, String password) {

		String[] usersArray;
		String currentPassword;
		String currentLogin;
		usersArray = userData.split("/");
		currentLogin = usersArray[1];
		currentPassword = usersArray[2];

		if (login.equals(currentLogin) && password.equals(currentPassword)) {
			return true;
		} else {
			return false;
		}

	}

	public String getAge(String userData) {
		String[] usersArray;
		String age;

		usersArray = userData.split("/");
		age = usersArray[3];

		return age;
	}




	@Override
	public User getUserByLogin(String login) throws DAOException {
		 try {
			 FileWriter writer = new FileWriter(USER_PATH,false);
				 String userLogin = login;
				 writer.write(userLogin);
			 }catch(IOException e){
				 throw new DAOException(e);
			 }
		return null;
		 }


@Override
 public boolean addUser(User user) throws DAOException {
	
	try{
		final int id = user.getUserid();
	
	user.setUserid(id);
	userFile.writeToFile(user);
	}catch (Exception e) {
		throw new DAOException(e);
	}

	return true;
}

@Override
public void deleteUser(User user) throws DAOException {
  try {
    UserFile.deleteFromFile(user);
  } catch (Exception e) {
    throw new DAOException(e);
  }
}


}




	
	
