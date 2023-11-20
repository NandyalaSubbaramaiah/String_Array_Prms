package com.app.programs;

import java.util.Scanner;

public class PalindromStr {
public static void main(String[] args) {

	String s="naman";
	String org_str=s;
	int len=s.length();
	String reverse="";
	for(int i=len-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);
	}
		if(org_str.equals(reverse)) {
			System.out.println("is a palindom :"+org_str);
		}else {
			System.out.println("is not a palindrom"+org_str);
		}
		
	}

}
