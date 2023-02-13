package org.tnsif.ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner ( System.in);
        System.out.println( " Enter the number of element: ");
        int n = sc.nextInt();
        
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
        	System.out.print(arr[i]);
        }
        /*
        Arrays.sort(arr);
        for ( int i=0; i<n; i++) {
        	System.out.println(arr[1]+" ");
        }*/
        Arrays.sort(arr);
        System.out.println( " Array after sorting : ");
        for (int itr:arr) {
        	System.out.print(itr + " ");
        }
	}

}
