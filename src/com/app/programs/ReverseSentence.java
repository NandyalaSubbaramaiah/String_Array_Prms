package com.app.programs;

import java.util.StringTokenizer;

public class ReverseSentence {
public static void main(String[] args) {
	String str="core java programs";
	StringTokenizer ST=new StringTokenizer(str);
	String revere="";
	while(ST.hasMoreTokens()) {
		revere=ST.nextToken()+" "+revere;
		
	}
	System.out.println(revere);
}
}
