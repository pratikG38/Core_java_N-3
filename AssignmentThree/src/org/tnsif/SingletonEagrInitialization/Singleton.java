package org.tnsif.SingletonEagrInitialization;
// Singleton Class using Eager initialization 
 
public class Singleton {

	//Eager initialization
	private static final Singleton INSTANCE = new Singleton();
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
		
	}
}