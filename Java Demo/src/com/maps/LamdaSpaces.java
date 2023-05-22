package com.maps;

import java.util.*;
import java.util.function.Consumer;
public class LamdaSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//           BiConsumer<Integer,Integer> val=(x,y) -> {System.out.println(x);
//           System.out.println(y); System.out.println(Math.pow(x,y));
//           };
//           val.accept(2, 3);

             Consumer<String> val=(x) -> {
                    System.out.print(x);
               for (int i = 0; i < x.length(); i++) {
                   System.out.print((x).charAt(i) + " ");
               }
        
             };
             val.accept("Hello ");

       }

}
