package org.tnsif.StringDemo;
//program to on StringBuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		//length vs capacity
		StringBuffer sb=new StringBuffer("Pratik ");
		System.out.println(sb);
        System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		String str;
		int a=23;
		sb=new StringBuffer(50);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);
		System.out.println(sb.reverse());

		

	}

}
