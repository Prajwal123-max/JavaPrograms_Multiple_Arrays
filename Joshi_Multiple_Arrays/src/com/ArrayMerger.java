/*
 * Sample Input:-
 * Enter the size of Array1:3
 * Enter the Element:
 * 1 2 3
 * Enter the size of Array2:5
 * Enter the Elements:
 * 4 5 6 7 8
 * 
 * Sample Output:-
 * 1 2 3 4 5 6 7 8
 * 
 * 
 */
package com;

import java.util.Scanner;

public class ArrayMerger {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array1:");
		int n1=s.nextInt();
		int[] ar1=new int[n1];
		System.out.println("Enter the Element:");
		for(int i=0; i<ar1.length; i++) {
			ar1[i]=s.nextInt();
		}
		System.out.print("Enter the size of Array2:");
		int n2=s.nextInt();
		int[] ar2=new int[n2];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar2.length; i++) {
			ar2[i]=s.nextInt();
		}
		arrayMerger(ar1, ar2);
	}
	public static void arrayMerger(int[] ar1,int[] ar2) {
		int[] res=new int[ar1.length+ar2.length];
		for(int i=0; i<ar1.length; i++) {
			res[i]=ar1[i];
		}
		for(int i=0; i<ar2.length; i++) {
			res[ar1.length+i]=ar2[i];
		}
		
//		Printing resultant Array
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
