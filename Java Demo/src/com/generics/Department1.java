package com.generics;
public class Department1{
package com.practicejava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Comparatorr {
public static void main(String[] args) {
// TODO Auto-generated method stub
int idD;
String NameD;
String leader;
int nopersons;
//Department dep=new Department();
ArrayList <Dept> str = new ArrayList<Dept>();
str.add(new Dept(27,"finance","geeta",20));
str.add(new Dept(28,"Agriculture","seeta",40));
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
import java.util.Comparator;
public class Dept implements Comparator<Dept> {
int idD;
String NameD;
String leader;
int nopersons;
public int getIdD() {
return idD;
}
public void setIdD(int idD) {
this.idD = idD;
}
public String getNameD() {
return NameD;
}
public void setNameD(String nameD) {
NameD = nameD;
}
public int getNopersons() {
return nopersons;
}
public void setNopersons(int nopersons) {
this.nopersons = nopersons;
}
public String toString() {
return "idD= "+idD+" NameD= "+NameD+" leader= "+leader+" nopersons= "+nopersons;
}
Dept(){}
Dept(int idD,String NameD,String leader,int nopersons){
idD=idD;
this.NameD=NameD;
this.leader=leader;
this.nopersons=nopersons;
}
@Override
public int compare(Dept o1, Dept o2) {
// TODO Auto-generated method stub
return 0;
}
}
java.util.Comparator;
public class NameD implements Comparator<Dept>  {
public int compare(Dept o1, Dept o2) {
// TODO Auto-generated method stub
return(o1.NameD.compareToIgnoreCase(o2.NameD));
}
}
public class Leader implements Comparator<Dept>  {
public int compare(Dept o1, Dept o2) {
return(o1.leader.compareToIgnoreCase(o2.leader));
}
}
}
