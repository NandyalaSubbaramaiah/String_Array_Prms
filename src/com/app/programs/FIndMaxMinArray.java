package com.app.programs;

public class FIndMaxMinArray {
public static void main(String[] args) {
	int[] array= {50,30,20,40};
	int max=array[0];
	for(int i=1;i<array.length;i++) {
		if(max<array[i]) {
			max=array[i];

		}
	}
	System.out.println("max numeber of array:"+max);

}
}
