package com.app.programs;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicatesArray {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("subbu");
	list.add("ramu");
	list.add("subbu");
	HashSet<String> set=new HashSet<String>();
	for(String ls:list) {
		if(set.add(ls)==false) {
			System.out.println(ls);
		}
	}
}
}
