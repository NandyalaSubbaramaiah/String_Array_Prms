package com.app.programs;

public class CountWordsInString {
	public static void main(String[] args) {
		
	
String inputstring="Java is a programming language";
//removing space in a string
//inputstring=inputstring.trim();
//splitting words in a string
String[] words=inputstring.split(" ");
int wordcount=words.length;
System.out.println("words in a string: "+wordcount);
}
}