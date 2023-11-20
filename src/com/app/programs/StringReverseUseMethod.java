package com.app.programs;

public class StringReverseUseMethod {
public static void main(String[] args) {
	String str="Ramu Rao";
	System.out.println(StringReverseUseMethod.reverserr(str));
	
	
}
public static String reverserr(String str) {
	String reverse=" ";
	for(int i=str.length()-1;i>0;i--) {
		reverse=reverse+str.charAt(i);
	
}
return reverse;
}
}
