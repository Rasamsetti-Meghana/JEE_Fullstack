package com.maps;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
public class HashMap {
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
		Iterator<Integer>it=map.keySet().iterator();
		int key;
		while(it.hasNext()) {
			
		}
	System.out.println("key "+key+"Student "+map.get(key)); }
	Boolean b= map.containsKey(12);
	System.out.println(b);
	}
}
