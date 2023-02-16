package org.tnsif.StringDemo;
import java.util.Scanner;
// string creation
public class SampleStringDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
		String str1=s.nextLine();
		System.out.println("First String is: "+str1);
		
		System.out.println("Enter the second string: ");
		String str2=new String(s.nextLine());
		System.out.println("Second String is: "+str2);
		if(str1.equals(str2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		char c[]= {'H','e','l','l','o'};
		String str3=new String(c);
		System.out.println(str3);
		

	}

}
