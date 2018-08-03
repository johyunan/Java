package com.java;

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try");
			System.out.println(0/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch¼öÇà");
		}finally {
			System.out.println("finally");
		}
	}
static void method1() throws Exception {
	method2();
}
static void method2() throws Exception {
	
}
}
