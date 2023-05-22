package com.activity;
import java.util.*;
public class ReplacingCon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder();
		String st=sc.next();
		str.append(st);
		String r="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
				System.out.print(c);
			}
			else {
				int ch=c+1;
				char cc=(char)(ch);
				System.out.print(cc);
			}
	}
	}
}
