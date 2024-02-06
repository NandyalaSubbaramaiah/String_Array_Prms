package com.app.abstr;

public abstract class Animal {
	String name;
	
	//abstract method
public abstract void animal();
//constructor
public Animal(String name) {
	this.name=name;
	System.out.println(name);
}
}

