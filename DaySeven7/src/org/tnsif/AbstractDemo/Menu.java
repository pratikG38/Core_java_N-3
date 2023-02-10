package org.tnsif.AbstractDemo;
// Abstract class and abstract method program 
// abstract Class
// class cannot be final abstract 
public abstract class Menu {
	abstract void recipe();
	abstract void foodtype();
	
	// non abstract  class
	void MenuType() {
		System.out.println( " Veg and Non Veg ");
	}

}
