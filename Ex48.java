package com.java;


//exception : 프로그램실행시 발생할수있는 예외에 
/* Exception classes
 * NoSuchMethodException 
 * ClassNotFoundException 
 * CloneNotSupportedException 
 * NegativeArraySizeException
 * NullPointerException
 */
//try-catch-finally
/*
 * try {예외가 발생할 가능성이 있는 실행문}
 * catch (처리할 예외 타입 선언) {예외가 발생했을 경우 처리하기위한 문장}
 * finally { 예외가 발생하지 않을 경우 실행문}
 * 
 */
public class Ex48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(1/0);
		System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);

	}

}
