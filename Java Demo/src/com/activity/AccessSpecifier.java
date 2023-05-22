package com.activity;

public class AccessSpecifier {

	public static void main(String[] args) {
	public int publicVar;
	int privateVar;
	int protectedVar;
	int defaultvar;
	
	public void publicMethod() {
		System.out.println("This is a public method");
	}
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}
	void defaultMethod() {
		System.out.println("This is a default member");
	}

	}

}
