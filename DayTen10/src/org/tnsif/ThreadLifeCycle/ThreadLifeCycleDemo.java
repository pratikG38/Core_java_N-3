package org.tnsif.ThreadLifeCycle;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tech t = new Tech ();
		SoftSkill s = new SoftSkill();
		t.start();
	t.yield();
		s.start();

	}

}
