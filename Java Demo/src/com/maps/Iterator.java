package com.maps;
import java.util.*;
import java.util.Iterator;
import java.util.Map;

import com.examples.Student;


public class Iterator {
public static void main(String[] args)
	{
		Map<Integer,String> map= new HashMap<>();
		Student st1=new Student(12,"shreya");
		Student st2=new Student(13,"Nivea");
		Student st3=new Student(14,"seetha");
		map.put(st1.getId(),st1);
		map.put(st2,getId(),st2);
		map.put(st3.getId(),st3);
		System.out.println(map.size());
		//type 1
		Iterator<Integer>it=map.keySet().iterator();
		int key;
		while(it.hasNext()) {
			key=(int)it.next();
			System.out.println("Key "+key+"Student "+map.get(key));
		}
		//type 2
		Iterator<Map.Entry<Integer,Student>> entry=map.entrySet().iterator();
		while(entry.hasNext()) {
			System.out.println(entry.next());
}
	//type 3
	Collection<Student>values=Student.class values();
	for(Student st:Values) {
		System.out.println();
	}
	}
}
	//System.out.println("key "+key+"Student "+map.get(key)); }
	//Boolean b= map.containsKey(12);
	//System.out.println(b);
	}
}