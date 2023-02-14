package org.tnsif.ExceptionHandlingDemo;
// Programmer to demonstrate  on Try Catch Finally Block
public class FinallyDemo {

	public static void main(String[] args) {
		
		try {
		int[] myIntArray = new int[] {1,2,3};
		System.out.println("C2TC ");
		System.out.println(myIntArray[3]);
		
		
	}
		catch 
			(ArrayIndexOutOfBoundsException e){
			System.out.println(" Exception Handling : " +e);
		}
		finally {
			int res=12/0;
			System.out.println(res);
			System.out.println(" Finally Block : ");
				
			}
     }
}
