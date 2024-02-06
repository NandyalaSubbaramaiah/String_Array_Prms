package com.app.maps;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RetriveKeyValuePairs {
public static void main(String[] args) {
	HashMap<String, String> map=new HashMap<String, String>();
	map.put("ONE", "SUBBU");
	map.put("TWO", "RAMANA");
	map.put("THREE", "REVANSH");
	Set<Entry<String,String>> KeyValueset=map.entrySet();
	for(Entry<String,String> entry:KeyValueset) {
		System.out.println(entry.getKey()+" :"+entry.getValue());
		
	}
	System.out.println("-------------------------------------");
	//remove key value pair from the map
	map.remove("TWO");
	
	for(Entry<String,String> entry:KeyValueset) {
		System.out.println(entry.getKey()+" :"+entry.getValue());
	}
	
	System.out.println("-------------------------------------");
	//REPLACING THE ASSOCIATED WITH THE "ONE" TO "REVANSH"
	
	map.replace("ONE", "RMANA");
	for(Entry<String,String> entry:KeyValueset) {
		System.out.println(entry.getKey()+" :"+entry.getValue());
	}
	
	System.out.println("-------------------------------------");

}
}
