package com.generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Comparator {
public static void main(String[] args) {

int idD;
String NameD;
String leader;
int nopersons;
//Department dep=new Department();
ArrayList <Dept> str = new ArrayList<Dept>();
str.add(new Dept(27,"finance","geeta",20));
str.add(new Dept(28,"Agriculture","seeta",40);        
str.add(new Dept(29,"banking","rama",50));
//str.add(new Department(30,"banking","geetu",70));
Collections.sort(str,new NameD());
Iterator<Dept> ss=str.iterator();
while(ss.hasNext()) {
Dept sss=ss.next();
System.out.println(sss.toString());
}
Collections.sort(str,new Leader());
Iterator<Dept> s=str.iterator();
while(s.hasNext()) {
Dept ss1=s.next();
System.out.println(ss1.toString());

            

        }

 

    }

 

}