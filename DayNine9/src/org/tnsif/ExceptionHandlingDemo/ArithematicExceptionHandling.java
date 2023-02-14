package org.tnsif.ExceptionHandlingDemo;

import java.util.Scanner;

public class ArithematicExceptionHandling {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the x and y Value : ");
		int x = s.nextInt();
		int y = s.nextInt();
		// try block contains the exeption code 
		try {
			int res=x/y;
			System.out.println( " Result is : " +res);
		}
		catch(Exception e) {
			System.out.println(" Exception handled : ");
			
		}
		finally
		{
			System.out.println(" Finally Block ");
		}
		
		
		

	}

}
