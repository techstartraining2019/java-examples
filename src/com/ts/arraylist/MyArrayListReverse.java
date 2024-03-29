package com.ts.arraylist;

import java.util.ArrayList;
import java.util.Collections;
 
public class MyArrayListReverse {
	
	//Program: How to reverse ArrayList content?
	//This example shows how to reverse ArrayList content. You can reverse the content by calling Collections.reverse() method. You have to pass ArrayList instance to this method, which reverses the content.
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
}
