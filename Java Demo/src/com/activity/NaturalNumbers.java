package com.activity;
import java.util.*;
public class NaturalNumbers {
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
			if((i%3==0||i%5==0)&&(i!=3 && i!=5)){
				System.out.println(i);
				sum=sum+i;
			}
	}
     return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
