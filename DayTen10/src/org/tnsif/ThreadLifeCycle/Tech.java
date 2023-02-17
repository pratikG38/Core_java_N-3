package org.tnsif.ThreadLifeCycle;
// program to demonstrate on Thread  lifecycle 
public class Tech extends Thread{
	public void run() {
		System.out.println("Java FUll Stack Trainging ");
		for (int i =1; i<=5;i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(2000);
				
			}
			catch(InterruptedException e) {
				System.out.println(e);
				
			}
			
		}
		System.out.println( " Technical Session");
	}

}
