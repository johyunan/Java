package com.java;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { 
			Exception e = new Exception("���Ƿ� �߻�");
			throw e ;//���ܸ� �߻�
		}
		catch (Exception e ) {
			System.out.println("error" +e.getMessage());
			e.printStackTrace(); //��κп��� ������ ������
		}
	}

}
