package com.app.programs;

public class CountLetters {
public static void main(String[] args) {
	String str="GeeksForGeeks$";
	int upper=0,lower=0,numbers=0,special=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		 if(ch>='A'&&ch<='Z') {
			 upper++;
		 }else if(ch>='a'&&ch<='z') {
			 lower++;
		 }else if(ch>='0'&&ch<='a') {
			 numbers++;
		 }else {
			 special++;
		 }
	}
	System.out.println(upper);
	System.out.println(numbers);
	System.out.println(lower);
	System.out.println(special);
}
}
