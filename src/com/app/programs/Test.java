package com.app.programs;

import java.util.Scanner;

public class Test {
	//public static void main(String[] args) {
		
	
	/*
static int a=m1();
static {
	System.out.println("execute static block");
}
 static int m1() {
	System.out.println("from m1");
	return 20;
}
public static void main(String[] args) {
	System.out.println("execute value of: "+a);
	System.out.println("from main");
	
	
	static int a=10;
	int b=20;
	public static void m1() {
		//static variable
		a=20;
		//non-static variable
		b=5;
		//non-static method
		m2();
		System.out.println(super.a);
	}
	void m2() {
		System.out.println("from m2");
		
}
	public static void main(String[] args) {
		
	}
}
  
  	//Reverse a string
	String s="subbu";
	String reverse="";
	for(int i=s.length()-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);
	}
		System.out.println(reverse);
	
}

		String s="subbu Rowsa";
		String[] words=s.trim().split(" ");
		System.out.println(words.length);
		
		//string reverse
		String reverse="subbu";
		//StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder();
		sb.append(reverse);
		sb.reverse();
		System.out.println(sb);
		
		//String reveres using method
		String str="Subbu";
		System.out.println(Test.reverse(str));
	}
		public static String reverse(String str) {
			String reverse="";
			for(int i=str.length()-1;i>=0;i--) {
				reverse=reverse+str.charAt(i);
			}
			return reverse;
		}
		
		  //String Palindrom
		String s="naman";
		String org_s=s;
		int len=s.length();
		String reverse="";
		for(int i=len-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}if(org_s.equals(reverse)) {
			System.out.println("is a palindrom string:"+org_s);
		}else {
			System.out.println("is not a palindrom:"+org_s);
		}
	
		//reverse a string by using to char array
		String s="Subramanyam";
		char[] ch=s.toCharArray();
		String reverse="";
		for(int i=ch.length-1;i>=0;i--) {
			reverse=reverse+ch[i]
;		}
		System.out.println(reverse);
		
			
		//reverse a string without using loop
		
		System.out.println(Test.Reverse("subbu"));
	}
		public static String Reverse(String s) {
		return new StringBuilder(s).reverse().toString();
		
		String s="Revaansh";
		for(char i:s.toCharArray()) {
			if(s.indexOf(i)==s.lastIndexOf(i)) {
				System.out.println("Non-Repeated charcters in a string :"+i);
			}
		}
		
		//Repeated characters in a string  
		String s="Revaansh";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
			}
		}
		
		
		String s="subbu";
		char ch[]=s.toCharArray();
		int i=0;
		for(char c:ch) {
			i++;
		}
		System.out.println(i);
		
		String s="Core JAVA PROGRAMMING KNOWLEDGE";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
				count++;
			}
			
		}
		System.out.println(count);
		
//count digits in a string
		int number = 0;
		
	       System.out.println(CountDigits(number));
	}
		public static int CountDigits(int number) {
			number=12344457;
			int count=0;
			while(number!=0) {
				number/=10;
						count++;
			}
			return count;
			}
	

		//find maxi number of array
		int[] arr= {9  0,60,70,80};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
				
			
			
		}
		System.out.println("maxi value is : "max);
		
	}	
	
	//minimum number of array
		
		int[] arr= {40,60,70,80};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];//90>60=60;60>70;..
			}
		}
		System.out.println("minimum value is :"+min);
	}
	//find duplicate array in string 
		String arr[]= {"ONE","TWO","ONE","THREE","FOUR","TWO"};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
		
		//find duplicate numbers in an array
		int arr[]= {4,3,5,4,1,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);					
			}
	
		}

		}
		
	//find the missing number in an array
		int arr[]= {1,2,3,4,5,6,7,9};
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];	
			
		
		}
		int sum2=0;
		for(int i=1;i<10;i++) {
			sum2=sum2+i;
			
			
		}
		System.out.println(sum2-sum1);	
		*/
		//reverse an array without aditional array
		public static void revere(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;  
				j++;
				
		}
		}
		public static void main(String[] args) {
			
		
				int arr[]= {2,3,5,7,8,9,9,90};
		        for(int i=0;i<arr.length;i++) {
		        	System.out.println(arr[i]);
	}
		       revere(arr); 
		       for(int i=0;i<arr.length;i++) {
		        	System.out.println(arr[i]);
		        
}
	

}
}
