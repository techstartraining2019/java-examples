package com.ts.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyVectorNewCollection {
	
	//Program: How to add all elements of a list to vector?
	//Below example shows how to copy or create a vector with another collection object. In the code we have created an ArrayList and by using addAll() method, we can copy another collection object.

	  public static void main(String a[]){
	        Vector<String> vct = new Vector<String>();
	        //adding elements to the end
	        vct.add("First");
	        vct.add("Second");
	        vct.add("Third");
	        vct.add("Random");
	        System.out.println("Actual vector:"+vct);
	        List<String> list = new ArrayList<String>();
	        list.add("one");
	        list.add("two");
	        vct.addAll(list);
	        System.out.println("After Copy: "+vct);
	    }
}
