package org.tnsif.ExceptionHandlingDemo;

import java.util.Scanner;

public class ThrowKeyword {
	
	static void donate(int age , int weight ) throws Exception
	{
	   if ( age >=18 && weight >50)
		  System.out.println( " Eligible to donate blood ");	
	   else 
		   throw new Exception(" Not Eligible ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println( " Enter the Age and Weight ");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		
		try {
			donate(age ,weight );
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
