package com.ts.arraylist;

import java.util.ArrayList;
import java.util.List;
 
public class MyListToCsvString {
	//Program: How to convert list to csv string format?
	//This example shows how to convert given list of strings to comma seperated values (csv) format.
 
    public String getListAsCsvString(List<String> list){
         
        StringBuilder sb = new StringBuilder();
        for(String str:list){
            if(sb.length() != 0){
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }
     
    public static void main(String a[]){
         
        List<String> li1 = new ArrayList<String>(){
            {
                this.add("animal");
                this.add("nuts");
                this.add("java");
            }
        };
        MyListToCsvString mtc = new MyListToCsvString();
        System.out.println(mtc.getListAsCsvString(li1));
        List<String> li2 = new ArrayList<String>(){
            {
                this.add("java");
                this.add("unix");
                this.add("c++");
            }
        };
        System.out.println(mtc.getListAsCsvString(li2));
    }
}
