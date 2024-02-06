package com.app.exception;

public class NullPointerException {

public static void main(String[] args) {
	
	try{
		int arr[]=null;
	System.out.println(arr.length);
	}catch (Exception e)  {
		System.out.println("cougt the exception");
	}
}
}
