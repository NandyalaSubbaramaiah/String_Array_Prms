package com.app.programs;

public class FindCommonEleArray {
public static void main(String[] args) {
	/*
	int[] arr1= {10,20,30,40,50,70};
	int[] arr2= {20,30,40,60,10,80};
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println("find common elements in the array: "+arr1[i]);
			}
		}
	}

	}
	*/
	/*
String[] str1= {"subbu","revansh","rajini"};
String[] str2= {"revansh","subbu","rjn"};
for(int i=0;i<str1.length;i++) {
	for(int j=0;j<str2.length;j++) {
		if(str1[i].equals(str2[j])) {
			System.out.println("common elements between the string array :"+str1[i]);
			
		}
	}
	*/
	/*
	int[] array= {2,4,5,6,7,2,4,5};
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]){
				System.out.println("find the common elemets between the array:"+array[i]);
			}
		}
}
	*/
	String[] str1={"TWO","THREE","FOUR","TWO"};
	for(int i=0;i<str1.length;i++) {
		for(int j=i+1;j<str1.length;j++) {
			if(str1[i].equals(str1[j])){
				System.out.println("find the common elements the array :"+str1[i]);
			}
		}
	}
}
}
