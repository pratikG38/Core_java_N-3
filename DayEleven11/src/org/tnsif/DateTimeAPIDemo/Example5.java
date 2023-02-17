package org.tnsif.DateTimeAPIDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {

	public static void main(String[] args) {
		//String x="17-02-2023  11:05";
		//DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		//LocalDateTime l=LocalDateTime.parse(x, df);
		LocalDateTime l=LocalDateTime.now();
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		String x=l.format(df);
		
		System.out.println(x);

	}

}