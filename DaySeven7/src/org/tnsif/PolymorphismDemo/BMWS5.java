package org.tnsif.PolymorphismDemo;

public class BMWS5 {
	private int speed;
	private String colour;
	// getters and setters 
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	// default constructors 
	public BMWS5() {
		System.out.println( " black ");
		
	}
	// parameterized 
	public BMWS5(int speed, String colour) {
		super();
		this.speed = speed;
		this.colour = colour;
	}
	

}
