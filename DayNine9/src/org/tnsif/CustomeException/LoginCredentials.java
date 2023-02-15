package org.tnsif.CustomeException;
// program to demonstrate on custom exception 
public class LoginCredentials extends Exception {
	 private String str ;
   // parameterized  constructor  
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	 

}
