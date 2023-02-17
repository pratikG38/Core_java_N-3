package org.tnsif.ThreadLifeCycle;

public class SoftSkill extends Thread  {
	
	synchronized public void run() {
		System.out.println("Professional Ethics ");
		for(int i=1;i<=5;i++) {
			System.out.print(i + " ");
		}
		System.out.println("Soft-Skill session ");
	}

}
	
