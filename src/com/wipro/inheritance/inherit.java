package com.wipro.inheritance;

class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Bird extends Animal {
	void eat() {
		System.out.println("Bird eats");
	}
	void sleep() {
		System.out.println("Bird sleeps");
	}
	void fly() {
		System.out.println("Bird flies");
	}
}

public class inherit {
	public static void main(String[] args) {
		Animal sc= new Animal();
		Bird c= new Bird();
		sc.eat();
		sc.sleep();
		c.eat();
		c.sleep();
		c.fly();
	}
}
