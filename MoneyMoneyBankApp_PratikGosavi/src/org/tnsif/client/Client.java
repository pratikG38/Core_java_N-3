package org.tnsif.client;

import org.tnsif.Application.MMBankFactory;
import org.tnsif.Application.MMCurrentAcc;
import org.tnsif.Application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {
	public static void main(String args[])
	{
		BankFactory b=new MMBankFactory();
		MMCurrentAcc c=new MMCurrentAcc(102,"Pratik",65000f,60.0f);
		MMSavingAcc s=new MMSavingAcc(103,"Payal",10000.0f,true);
		System.out.println("Saving Account");
		System.out.println(s);
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		System.out.println(c);
		c.withdraw(c.getAccBal());
		
	}
}
