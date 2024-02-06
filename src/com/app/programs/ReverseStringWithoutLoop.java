package com.app.programs;

public class ReverseStringWithoutLoop {
public static void main(String[] args) {
	String s="subbu";
	System.out.println(ReverseStringWithoutLoop(s));
}
	public static String ReverseStringWithoutLoop(String s) {
	 return new StringBuilder(s).reverse().toString();
	}

}
