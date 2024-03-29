package com.ts.enumeration;
//Java Enumeration Sample Code
//A class that implements Enumeration interface provides access to series of elements one at a time. You need to call nextElement method to get next element in the series. Also hasMoreElements() method gives you status about the availability of next element in the series.
import java.util.Enumeration;
import java.util.Vector;
 
public class MyEnumeration {
    public static void main(String a[]){
        Vector<String> lang = new Vector<String>();
        Enumeration<String> en = null;
        lang.add("JAVA");
        lang.add("JSP");
        lang.add("SERVLET");
        lang.add("EJB");
        lang.add("PHP");
        lang.add("PERL");
        en = lang.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}