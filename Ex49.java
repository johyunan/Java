package com.java;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { 
			Exception e = new Exception("고의로 발생");
			throw e ;//예외를 발생
		}
		catch (Exception e ) {
			System.out.println("error" +e.getMessage());
			e.printStackTrace(); //어떤부분에서 에러가 났는지
		}
	}

}
