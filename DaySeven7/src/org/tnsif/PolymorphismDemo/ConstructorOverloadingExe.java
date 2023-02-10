package org.tnsif.PolymorphismDemo;

import java.util.Scanner;

public class ConstructorOverloadingExe {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println( " Enter the speed : " );
		int speed =s.nextInt();
		// System.out.println( " Enter the color : " );
	    String  colour =s.nextLine();
	    BMWS5 b = new BMWS5();
	    BMWS5 b1 = new BMWS5( speed , colour );

	}

}
