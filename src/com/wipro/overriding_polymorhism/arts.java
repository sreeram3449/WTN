package com.wipro.overriding_polymorhism;

class shape{
	void draw() {
		System.out.println("drawing shape");
	}
	void erase() {
		System.out.println("erasing shape");
	}
	
}
class Circle{
	void draw() {
		System.out.println("drawing Circle");
	}
	void erase() {
		System.out.println("erasing Circle");
	}
}

class Triangle{
	void draw() {
		System.out.println("drawing Triangle");
	}
	void erase() {
		System.out.println("erasing Triangle");
	}
}

class Square{
	void draw() {
		System.out.println("drawing Square");
	}
	void erase() {
		System.out.println("erasing Square");
	}
}
public class arts {
	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle t=new Triangle();
		Square s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		}
}
