package com.daythree.anotherpackage;
import com.daythree.firstpackage.SameClass;
public class inheritedClass extends SameClass {
public void accessVariable() {
//        SameClass var =  new SameClass();
//        var.publicVar = 1;
//        var.protectedVar = 1; 
//        privateVar = 1; // Private Not visible in another package and class
//        defaultVar = 1; // Private Not visible in another package
 publicVar = 1;
 protectedVar = 1;
    }
}