package org.tnsif.PolymorphismDemo;

import java.util.Scanner;

public class MethodoverloadingExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println( " Enter the resolution and slottype: " + " Of your phone ");
		int resolution = sc.nextInt();
		sc.nextLine();
		String Stringslottype = sc.nextLine();
		SmartPhone s = new SmartPhone();
		s.setResolution(resolution);
		s.setSlottype(Stringslottype);
		s.display(resolution);
		s.display(resolution, Stringslottype);
		
		multiplication m = new multiplication ();
		
		
	} 

}
