package com.app.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;


import java.util.Set;

public class JavaHasMapPRMS {
public static void main(String[] args) {
	HashMap<String, Integer> map=new HashMap<String,Integer>();
	map.put("subbu", 1);
	map.put("ramu", 2);
	map.put("Ragav", 3);
	map.put("raman", 4);
	Collection<Integer> values = map.values();
	for(Integer number:values) {
		System.out.println("getting only values in a map: "+number);
	}
	Collection<String> values1 = map.keySet();
	for(String names:values1) {
		System.out.println("getting only keys in a map: "+names);
	}
	
	Set<Entry<String, Integer>> setEntry=map.entrySet();
	for(Entry<String, Integer> entry:setEntry) {
		System.out.println(entry.getKey()+":"+entry.getValue());
		
	}
	System.out.println("--------------");

HashMap<String,Integer> anotherhashmap=new HashMap<String, Integer>();
anotherhashmap.put("rani", 5);
anotherhashmap.put("subu", 6);
anotherhashmap.putAll(map);
System.out.println(anotherhashmap);

//retrieve the value of from the map by using key()
int value=map.get("Ragav");
System.out.println("value of ragav: "+value);

//we are checking value/key is an existing of map
System.out.println(anotherhashmap.containsKey("ramu"));
System.out.println(anotherhashmap.containsValue(4));

//find out number of keys and values in a map
System.out.println("keys and values in a map :"+anotherhashmap.size());

//Checking the number of key-value pairs after clearing the map
anotherhashmap.clear();
System.out.println("--------------");
System.out.println("keys and values in a map :"+anotherhashmap.size());

}
}

