package com.wipro.Encapsulation;

class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	String Name;
	Author author;
	double price;
	int qtyinstock;
	Book(String Name,double price,int qtyinstock){
		this.Name=Name;
		this.price=price;
		this.qtyinstock=qtyinstock;
	}
}

public class Novel {
	public static void main(String[] args) {
		Book sc=new Book("adsaf",45.45,65);
		Author author=new Author("asdf","asdfdf",'m');
		System.out.println(sc.Name()+""+author.name()+""+author.email+""+author.gender+""+sc.price+""+sc.qtyinstock);
	}
}
