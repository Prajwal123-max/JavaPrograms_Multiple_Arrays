/*
 * Sample Input:-
 * Enter the size of Array1:3
 * Enter the ELements:
 * 1 2 3
 * Enter the size of Array2:2
 * Enter the ELements:
 * 4 5
 * Enter the size of Array3:4
 * Enter the ELements:
 * 6 7 8 9
 * 
 * Sample Output:-
 * 1 2 3 4 5 6 7 8 9
 * 
 */
package com;

import java.util.Scanner;

public class ArrayMergersThreeArrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array1:");
		int n1=s.nextInt();
		int[] ar1=new int[n1];
		System.out.println("Enter the ELements:");
		for(int i=0; i<ar1.length; i++) {
			ar1[i]=s.nextInt();
		}
		System.out.print("Enter the size of Array2:");
		int n2=s.nextInt();
		int[] ar2=new int[n2];
		System.out.println("Enter the ELements:");
		for(int i=0; i<ar2.length; i++) {
			ar2[i]=s.nextInt();
		}
		System.out.print("Enter the size of Array3:");
		int n3=s.nextInt();
		int[] ar3=new int[n3];
		System.out.println("Enter the ELements:");
		for(int i=0; i<ar3.length; i++) {
			ar3[i]=s.nextInt();
		}
		
		arrayMergerOfThreeArrays(ar1, ar2, ar3);
		
	}
	public static void arrayMergerOfThreeArrays(int[] ar1,int[] ar2,int[] ar3) {
		int size=(ar1.length)+(ar2.length)+(ar3.length);
		int[] res=new int[size];
		for(int i=0; i<ar1.length; i++) {
			res[i]=ar1[i];
		}
		for(int i=0; i<ar2.length; i++) {
			res[ar1.length+i]=ar2[i];
		}
		for(int i=0; i<ar3.length; i++) {
			res[ar1.length+ar2.length+i]=ar3[i];
		}
		
//		Printing Resultant Array
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
