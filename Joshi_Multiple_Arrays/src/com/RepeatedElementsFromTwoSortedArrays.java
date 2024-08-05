/*
 * Sample Input:-
 * Enter the size of Array1:5
 * Enter the Elements:
 * 1 2 3 4 5
 * Enter the size of Array2:5
 * Enter the Elements:
 * 1 2 4 6 8
 * 
 * Sample Output:-
 * 1 2 4
 * 
 */
package com;

import java.util.Scanner;

public class RepeatedElementsFromTwoSortedArrays {

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
		repeatedElements(ar1, ar2);
	}
	public static void repeatedElements(int[] ar1,int[] ar2) {
		int i=0,j=0;
		boolean found=false;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]==ar2[j]) {
				System.out.print(ar1[i]+" ");
				found=true;
				i++;
				j++;
			}else if(ar1[i]<ar2[j]) {
				i++;
			}else {
				j++;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}

}
