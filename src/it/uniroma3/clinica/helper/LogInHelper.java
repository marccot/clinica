package it.uniroma3.clinica.helper;

public class LogInHelper {
	
	public boolean logInValidator(String password, String username) {
		if(password == "" || username == "" )
			return false;
		return true;
	}

}
