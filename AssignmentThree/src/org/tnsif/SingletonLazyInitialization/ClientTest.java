package org.tnsif.SingletonLazyInitialization;
//Client Program getting singleton instance of Singleton class

import org.tnsif.SingletonEagrInitialization.Singleton;

public class ClientTest {

	public static void main(String[] args) {
		
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		
	}

}