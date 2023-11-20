package com.app.programs;

import java.util.HashSet;
import java.util.*;


public class FindStringDuplicates {
public static void main(String[] args) {
	java.util.ArrayList<String> list=new java.util.ArrayList<String>();
	list.add("subbu");
	list.add("RVN");
	list.add("JNN");
	list.add("subbu");
	list.add("RVN");
	Set<String> st=new HashSet<String>();
	for(String names:list) {
		if(st.add(names)==false) {
			System.out.println("duplicates in string :"+names);
		}
	}
	
	
}
}
