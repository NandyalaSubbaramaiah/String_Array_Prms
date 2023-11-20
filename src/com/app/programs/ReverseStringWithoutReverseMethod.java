package com.app.programs;

public class ReverseStringWithoutReverseMethod {
public static void main(String[] args) {
	String str="subbu";
	String reverse="";
	int len=str.length();
	for(int i=len-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
	}
	System.out.println(reverse);
}
}
