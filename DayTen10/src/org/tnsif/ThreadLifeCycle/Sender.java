package org.tnsif.ThreadLifeCycle;

public class Sender {
	public void sendMassege(String messege ) {
		System.out.println("\n Sending " + messege );
		try {
			Thread.sleep(1000);
			
		}
		catch (Exception e) {
			System.out.println(" Thread Intrrupted "	);
		}
	}

}
