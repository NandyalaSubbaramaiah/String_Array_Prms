package com.app.programs;

public class SecondLargestNumberArray {
public static void main(String[] args) {
	int[] arr= {50,40,30,60};
	int max=0,secondmax=0;
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			secondmax=max;
			max=arr[i];
		}else 
			if(max!=arr[i]&&secondmax<arr[i]){
				secondmax=arr[i];

			}
		}
		System.out.println(secondmax);
	}
}

