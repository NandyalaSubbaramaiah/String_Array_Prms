package com.app.programs;

import java.util.HashSet;
import java.util.Set;

public class ArrayList {
	public static void main(String[] args) {
		
		/*
		 //find duplicates
		 
		java.util.ArrayList<String> list=new java.util.ArrayList<String>();
		list.add("subbu");
		list.add("vara");
		list.add("subbu");
		Set<String> s=new HashSet<String>();
		
		for(String namel: list) {
			if(s.add(namel)==false) {
				System.out.println(namel);
			}
		}
		
	*/
		
		//find minmim value
		int arr[]={50,20,30,70,60};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			System.out.println("print min: "+min);

		}
	}
	
}
