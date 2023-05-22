package com.activity;

public class ExceptionHandling {  
public static void main(String args[]){  
int num1=5;
int num2=0;
int num3;
try{   
	num3=num1/num2;
	System.out.println(num3);
}
catch(ArithmeticException e){
System.out.println("Denominator should not be zero");
}   
System.out.println("rest of the code...");  
}  
}  