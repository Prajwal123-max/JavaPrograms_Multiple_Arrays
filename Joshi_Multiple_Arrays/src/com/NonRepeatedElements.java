/*
 * Sample Input:-
 * Enter the size of Array1:5
 * Enter the Elements:
 * 1 2 3 4 5
 * Enter the size of Array2:6
 * Enter the Elements:
 * 2 4 6 8 10 12
 * 
 * Sample Output:-
 * 1 3 5 6 8 10 12
 * 
 */
package com;

import java.util.Scanner;

public class NonRepeatedElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array1:");
		int n1=s.nextInt();
		int[] ar1=new int[n1];
		System.out.println("Enter the Elements:");
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
		nonRepeatedElements(ar1, ar2);
	}
	public static void nonRepeatedElements(int[] ar1,int[] ar2) {
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;
			}else if(ar1[i]>ar2[j]) {
				System.out.print(ar2[j]+" ");
				j++;
			}else {
				i++;
				j++;
			}
		}
		while(i<ar1.length) {
			System.out.print(ar1[i]+" ");
			i++;
		}
		while(j<ar2.length) {
			System.out.print(ar2[j]+" ");
			j++;
		}
	}

}
