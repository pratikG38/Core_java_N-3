package org.tnsif.enumdemo;

public class EnumCarDemo {

	public static void main(String[] args) {
		// accessing e-num Constants
		//Car r1 = Car.TESLA;
		//System.out.println(r1);
		for(Car c:Car.values()) {
			System.out.println(c);
		}

	}

}
 