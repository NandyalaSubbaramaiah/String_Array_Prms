package com.app.programs;

public class FindMissingNumberArray {
public static void main(String[] args) {
	int[] array= {1,2,3,4,5,6,8,9};
    int sum=0;
    for(int i=0;i<array.length;i++) {
    	sum=sum+array[i];
    	
    }
    System.out.println("total number of array:"+sum);

int sum2=0;
for(int i=1;i<10;i++) {
	sum2=sum2+i;
}
System.out.println(sum2-sum+": missing number in array");
}
}