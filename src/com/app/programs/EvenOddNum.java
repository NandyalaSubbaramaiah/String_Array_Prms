package com.app.programs;

public class EvenOddNum {
public static void main(String[] args) {
	int sum=0;
	int[] array= {2,3,4,5,7,8};
	for(int i=0;i<array.length;i++) {
		
		if(array[i]%2==0) {
			sum=sum+array[i];
			System.out.println("even numbers:"+array[i]);
			System.out.println("sum of even: "+sum);
			
			
		}else {
			if(array[i]%2==1) {
				System.out.println("odd numbers :"+array[i]);
			}
		}
	}

}
}