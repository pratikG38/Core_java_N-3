package org.tnsif.ArrayDemo;

import java.util.Scanner;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner (System.in);
		 int n = s.nextInt();
		 int m = s.nextInt();
		 int arr[][] = new int [n][m];
		 for (int i=0; i<n;i++) {
			 for (int j=0; j<m;j++) {
				 arr[i][j]=s.nextInt();
			 }
		 }
		 for (int i=0; i<n;i++) {
			 for (int j=0; j<m;j++) {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println(); 
		 }
		 
	}

}
