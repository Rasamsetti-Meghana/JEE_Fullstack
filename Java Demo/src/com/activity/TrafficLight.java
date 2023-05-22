package com.activity;
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String radiobuttons=sc.next();
		switch(radiobuttons){
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
		System.out.println("go");
		break;
		default:
			System.out.println("no traffic");
		
		}
		

	}

}
