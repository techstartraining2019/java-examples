package com.ts.enumeration;

import java.util.Hashtable;

public class MyHashtableOperations {
	
	//Program: Basic Hashtable Operations
	//Below example shows basic operations on Hashtable like creating hashtable object, adding key-value pair, getting the value based on key, checking hashtable is empty or not, removing an element, and size of the hashtable. 
 
    public static void main(String a[]){
        //Create hashtable instance
        Hashtable<String,String> ht = new Hashtable<String,String>();
        //add key-value pair to hashtable
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third","THIRD INSERTED");
        System.out.println(ht);
        //getting value for the given key from hashtable
        System.out.println("Value of key 'second': "+ht.get("second"));
        System.out.println("Is Hashtable empty? "+ht.isEmpty());
        ht.remove("third");
        System.out.println(ht);
        System.out.println("Size of the Hashtable: "+ht.size());
    }
}
