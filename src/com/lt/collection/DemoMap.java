/**
 * 
 */
package com.lt.collection;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;


/**
 * @author user214
 *
 */
public class DemoMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm1.put(101, "MALE");
		hm1.put(102, "DELHI");
		hm1.put(103, "New York");
		hm1.put(103, "Dubai");
		hm1.put(101, "LONDON");

		hm.put(102, "MALDIVES");
		hm.put(101, "MALDIVES");
		hm.put(106, "UK");
		hm.put(105, "US");

		for (Entry<Integer, String> m : hm1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
