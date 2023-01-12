package com.bridgelabz.logicalprograms;

//perfect number given number and less than that number who divides that number 
//after adding those numbers sum will be equal to that number 
//6=1+2+3 6=6
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int n;int sum=0;
		System.out.println("Enter the number");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		for(int i=1; i<n; i++) {
			if(n % i==0) {
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a Perfect Number");
		}			
	}

}
