package com.app.programs;

public class FindRepeatedNonRepeatedStr {
public static void main(String[] args) {
	String str="subbu";
	char ch[]=str.toCharArray();
	
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(ch[i]==ch[j]) {
				System.out.println("repeated: "+ch[i]);
			}
		}
	
		
	
	
	}

	for(char i:str.toCharArray()) {
		if(str.indexOf(i)==str.lastIndexOf(i)) {
			System.out.println("non repeated: "+i);
		}
	}
}
}

	





