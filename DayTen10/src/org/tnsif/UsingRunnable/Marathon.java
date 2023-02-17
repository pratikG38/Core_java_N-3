package org.tnsif.UsingRunnable;
// Program to demonstrate on runnable interface for a thread 
public class Marathon implements Runnable {
	// private data members
	private int speed;
	private String city; 
	//getters and setters 

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	// runnable interface contains run() method by default
	public void run() {
		System.out.println("The Speed of participant:  "+speed + " The City is: " +city );
		
		
	}
	

}
