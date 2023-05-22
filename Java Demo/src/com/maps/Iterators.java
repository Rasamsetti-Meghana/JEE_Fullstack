package com.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//import com.hashmap.Employee;

public class Iterators {
           public static void main(String[] args)
           {
               
               HashMap<Integer, Employee> mpEmp = new HashMap<>();
       
             
               Employee emp = new Employee(9,"Meghana",50000);
                    Employee emp1 = new Employee(10,"Priyanka",40000);
                    Employee emp2 = new Employee(11,"Shreya",30000);
                    Employee emp3 = new Employee(12,"Girisha",60000);
                    
                    mpEmp.put(emp.getEmpId(),emp);
                    mpEmp.put(emp1.getEmpId(),emp1);
                    mpEmp.put(emp2.getEmpId(),emp2);
                    mpEmp.put(emp3.getEmpId(),emp3);
                    
               //using keyset()
//                  
//             Set<Integer> KeySet = mpEmp.keySet();
//             
//             for(Integer key : KeySet) {
//                  Employee e = mpEmp.get(key);
//                  System.out.println(e);
//                  System.out.println(key);
//             }
               
               //using values()
                    
                    
//                  Collection<Employee> values = mpEmp.values();
//                  for(Employee em : values) {
//                  System.out.println(em);
//             }
                    
                    
                    //using entryset()
                    
                    
                Set<Entry<Integer,Employee>> entrySet = mpEmp.entrySet();
                    for(Entry<Integer,Employee> entry : entrySet) {
                    Integer key = entry.getKey();
                    Employee em = entry.getValue();
                    System.out.println(key);
                    System.out.println(em);
               }
           }
       }
