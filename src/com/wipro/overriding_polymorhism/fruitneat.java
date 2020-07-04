package com.wipro.overriding_polymorhism;

class fruit{
	String name;
	String taste;
	int size;
	/*fruit(String name,String taste, int size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}*/
	void eat() {
		System.out.println(name+" tastes "+taste);
	}
}

class Apple extends fruit {
	String name="Apple";
	String taste="Sweet";
	void eat() {
		System.out.println(name+" tastes "+taste);
	}
}

class Orange extends fruit {
	String name="Orange";
	String taste="Tart";
	void eat() {
		System.out.println(name+" tastes "+taste);
	}
}
public class fruitneat {
	public static void main(String[] args) {
		Apple a=new Apple();
		Orange o=new Orange();
		a.eat();
		o.eat();
	}
}
