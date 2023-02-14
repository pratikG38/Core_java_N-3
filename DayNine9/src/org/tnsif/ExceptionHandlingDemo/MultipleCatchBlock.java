package org.tnsif.ExceptionHandlingDemo;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int arr[] = new int[] {11,12,130};
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the X and Y value ");
		int x =s.nextInt();
		int y = s.nextInt();
		try {
			int res=x/y;
			System.out.println(res);
			System.out.println(arr[3]);
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException  e) {
			System.out.println( " exception handled ");
		}
		
}
}