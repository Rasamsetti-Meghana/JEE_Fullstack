package com.generics;
class MyGen<T> {
T obj;
void add(T obj) {
	this.obj=obj;
   }
    T get() {
	return obj;
}
public class GenericMain{
	public static void main(String[] args) {
	MyGen<Integer> m = new MyGen<>();
	m.add(2);
    System.out.println(m.get());
	}
}
}
