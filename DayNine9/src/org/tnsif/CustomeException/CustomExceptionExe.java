package org.tnsif.CustomeException;

import java.util.Scanner;

public class CustomExceptionExe {

	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   String id  = sc.nextLine();
	   String password =sc.nextLine();
	   try {
		   if (id.equals(" pratikgosavi37@gmail.com ") && password.equals( " pr@123 " ))
			   throw new LoginCredentials (" Invalid Creadential");
		   else {
			   System.out.println(" Creadential Matched   ");				   
		   }   
	   }
	   catch(LoginCredentials e )
	   {
		   System.out.println( " Exception Handles " +e );
	   }
	   finally {
		   System.out.println(" Finally Block");
	   }
	   
	}

}
