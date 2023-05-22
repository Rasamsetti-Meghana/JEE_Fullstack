package com.exception;
import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}
public class AgeOfAPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			validateAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}
	public static void validateAge(int age)throws InvalidAgeException {
		if(age<=14) {
			throw new InvalidAgeException("child labour");
		}
		else {
			System.out.println("you can happily work");
		}
	}

}
