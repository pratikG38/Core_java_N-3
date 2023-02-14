package org.tnsif.ExceptionHandlingDemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		int arr[]=new int[] {101,102,103};
		try {
			System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Exception handling : " +e);
		}
		finally {
			System.out.println("Finally Block ");
		}

	}

}
