package org.tnsif.ArrayDemo;
// program to demonstrate on array objects 
public class Student {
	private int rollno;
	private String name;
	private float per;
	
	// Getters and setters

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	// Parameterized 
	public Student(int rollno, String name, float per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
 
	
	

    
}
