package com.maps;

@FunctionalInterface
interface Calculator {
	int pow(double x,double y);
}

public class LamdaExpression {

	public static void main(String args[]) {
		Calculator calc=(x,y)->(int)(Math.pow(x, y));
		System.out.println(calc.pow(2,3));
	}
	
}
//math.pow()