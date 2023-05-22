package com.comparable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDepartment {
	
public static void main(String args[]) {
//create a list of Department
List<Department> depList =new ArrayList<Department>();
depList.add(new Department(33,"HRdepartment", "priya",4));
depList.add(new Department(99,"Financialdepartment","shreya",5));
depList.add(new Department(60,"Admindepartment", "Ram",3));
Collections.sort(depList);
Iterator<Department> depIterator=depList.iterator();
while(depIterator.hasNext()) {
Department dep =depIterator.next();
System.out.println(dep);
 }
}
}
}

