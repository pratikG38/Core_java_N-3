package org.tnsif.enumdemo;

public enum Meal {
	BREAKFAST(4),LUNCH(7), DINNER(10);
	private int value;
	
	// getters and setters 
	
      public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	// parameterized constructors 
	private Meal(int value) {
		this.value = value;
	}
	

}
