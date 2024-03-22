package com.registrationapp.model;

import java.sql.ResultSet;

public interface DAOService {

	public void connectDB();
	public boolean verifyCredentials(String email ,String password);
	public void saveRegistration(String name, String city, String email, String mobile);
	public ResultSet listAllReg();
	public void deletebyEmailId(String email);
	public void updateRegistration(String email, String mobile);
	
}
