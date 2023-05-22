package com.activity;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int check=sc.nextInt();
		for(int i=2;i<=check;i++) {
			if(isPrime(i)) {
				System.out.println(i+"");
			}
		}

	}
	public static boolean isPrime(int num) {
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
		return false;
	}
}
	return true;

}
}
