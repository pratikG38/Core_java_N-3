package org.tnsif.StringDemo;

public class StringComparisonDemo {

	public static void main(String[] args) {
		//creating a string using literals
		String s1="RR";
		String s2="RR";
		
		//creating a string using new operator
		String s3=new String("BMW");
		String s4=new String("BMW");
		
		//string comparison
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s4));
		
		//using compareTo
		System.out.println(s1.compareTo("bmw"));
		System.out.println(s1.compareToIgnoreCase("bmw"));
		System.out.println(s1.compareTo(s2));



	}

}
