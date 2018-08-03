package com.java;


class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
}
public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(10L);
		Person p2 = new Person(20L);
		Person p3 = new Person(10L);
		
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		System.out.println(p.equals(null));
		System.out.println(p.equals(p));
		
		String str = "hello";
		String str2 = "hi";
		System.out.println(str.equals(str2));
		
	}

}
