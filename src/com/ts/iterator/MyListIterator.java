package com.ts.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class MyListIterator {
	
	//Java ListIterator Sample Code
	//Using ListIterator, we can iterate all elements of a list in either direction. You can access next element by calling next() method, and also you can access previous element by calling previous() method on the list. 
    public static void main(String a[]){
        List<Integer> li = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        litr=li.listIterator();
        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
