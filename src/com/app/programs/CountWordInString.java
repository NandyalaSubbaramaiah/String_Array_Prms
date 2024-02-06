package com.app.programs;

public class CountWordInString {
public static void main(String[] args) {
	String str="Subbu is a tester";
	int count=1;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
			count++;
			
		}
	}
	System.out.println("count words in a string :"+count);
}
}
