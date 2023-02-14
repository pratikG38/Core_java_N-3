package org.tnsif.ExceptionHandlingDemo;

import java.util.Scanner;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {11,12,130};
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the X and Y value ");
		int x =s.nextInt();
		int y = s.nextInt();
		try {
			
			try {
				System.out.println(arr[3]);
			}
			catch( ArrayIndexOutOfBoundsException  e) {
				System.out.println( " exception handled 1 " +e);
			}
			try {
				
				int res =x/y;
				System.out.println(res );
			}
		    catch(ArithmeticException e) {
			System.out.println( " exception handled 2 " +e );
		    }
			}
		finally {
			System.out.println(" Finally Block : ");
				
			}
	 }

}
