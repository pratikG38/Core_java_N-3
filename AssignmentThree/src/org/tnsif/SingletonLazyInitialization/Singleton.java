package org.tnsif.SingletonLazyInitialization;
public class Singleton {

	private static Singleton INSTANCE = null;
	private Singleton() {

	}

		public static Singleton getInstance() {
		//If Instance is null then only instantiate
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;

	}
}