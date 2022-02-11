/**
 * 
 */
package com.lt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author user214
 *
 */
public class DemoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>(); //use of generics restrict the list to use only one type: typesafe
		System.out.println("Size of collection: " + list.size());
		list.add("Mumbai");
		list.add("Canada");
		list.add("Pune");
		list.add("Pune");
		//list.add(23);
		System.out.println("Size of collection: " + list.size());
		list.remove(1);
		System.out.println("Size of collection: " + list.size());
		// Iterate the collection with iterator and for loop
		
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {

			String test = i.next();
			System.out.println("detals of Capital------>" + test);
		}
        
  
        // Another way to iterate the collection using for loop 
        
     // Loop through elements.
           for (String value : list) {
       	    
       	    System.out.println("Element: " + value);
       	}
		
		
	}

	}


