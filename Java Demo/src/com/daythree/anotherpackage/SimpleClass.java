package com.daythree.anotherpackage;
import com.daythree.firstpackage.SameClass;
public class SimpleClass {
public void accessVariable() {
	SameClass var = new SameClass();

     var.publicVar = 1;
//        var.protectedVar=1; // Private Not visible in another package 
//        var.privateVar=1;   // Private Not visible in another package and class
//        var.defaultVar=1;  // Private Not visible in another package
    }
}