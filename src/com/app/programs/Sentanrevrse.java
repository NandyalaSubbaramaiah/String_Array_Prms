package com.app.programs;

import java.util.StringTokenizer;

public class Sentanrevrse {

	public static void main(String[] args) {
		String s="Core java programming";
		StringTokenizer ST=new StringTokenizer(s);
		String reverse=" ";
		while (ST.hasMoreTokens()) {
			reverse=ST.nextToken()+" "+reverse;
			
		}
		System.out.println(reverse);
	}

}
