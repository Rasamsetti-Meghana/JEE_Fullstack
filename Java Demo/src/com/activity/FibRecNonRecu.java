package com.activity;
import java.util.*;


public class FibRecNonRecu {
	public static int withOutRecursion(int n) {
		int firstnum=1,secondnum=1,sum=0;
		for(int i=3;i<=n;i++) {
			sum=firstnum+secondnum;
		    firstnum=secondnum;
		    secondnum=sum;
		}
	return sum;
}
public static int withRecursion(int n) {
	if(n==1||n==2) {
		return 1;
	}
	else {
		return withRecursion(n-1)+withRecursion(n-2);
	}
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("with out recursion"+withOutRecursion(n));
	System.out.println("with recursion"+withRecursion(n));
}
}
	
	
	
	
	
	
	
	
	
	
	
	
