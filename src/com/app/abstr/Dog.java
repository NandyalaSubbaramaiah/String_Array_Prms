package com.app.abstr;

public class Dog extends Animal{
//constructor
	public Dog(String name) {
		super(name);
		
	}
	
	@Override
	public void animal() {
		String eat="grass";	
		String cowEat=eat;
		System.out.println("eating cow: "+cowEat);
	}
	public static void main(String[] args) {
		//instance variable
		int a=20;
	System.out.println(a);
	Dog dog=new Dog("subbu");
	
	dog.animal();
	
	}
}
