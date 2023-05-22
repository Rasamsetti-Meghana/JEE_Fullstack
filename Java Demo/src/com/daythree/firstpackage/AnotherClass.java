package com.daythree.firstpackage;

public class AnotherClass {

public void accessVariable(String args[]) {

SameClass var = new SameClass();

var.publicVar = 1;
var.protectedVar = 1;
//        var.privateVar=1;  // Private Not visible in another class
     var.defaultVar = 1;
    }
}