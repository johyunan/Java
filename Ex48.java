package com.java;


//exception : ���α׷������ �߻��Ҽ��ִ� ���ܿ� 
/* Exception classes
 * NoSuchMethodException 
 * ClassNotFoundException 
 * CloneNotSupportedException 
 * NegativeArraySizeException
 * NullPointerException
 */
//try-catch-finally
/*
 * try {���ܰ� �߻��� ���ɼ��� �ִ� ���๮}
 * catch (ó���� ���� Ÿ�� ����) {���ܰ� �߻����� ��� ó���ϱ����� ����}
 * finally { ���ܰ� �߻����� ���� ��� ���๮}
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
