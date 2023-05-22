package com.generics;

class Dummy{
public <E> void printArray(E[] elements) {
		for(E e: elements) {
			System.out.println(e);
		}
	}
void display() {
	int a = 10;
	int b = 3;
	int c=a+b;
}
int sum(float a, int b)
{
	return (int) (a+b);
}
double sum(float a,double b)
{
	return (double)(a+b);
}
}
	public class GenericClass {
	public static void main(String args[]) {
		Integer[] intArray = {10,20,30};
		String[] stringArray = {"Java",".Net","CPP"};
		Double[] doubleArray = {10.2,3.5};
		Dummy dum=new Dummy();
		dum.printArray(intArray);
		dum.printArray(stringArray);
		dum.printArray(doubleArray);
		}
}
	


