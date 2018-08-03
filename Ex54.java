package com.java;
class Card implements Cloneable {
	String kind;
	int number;
	
	Card() {
		this("SPADE",1);
	}
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "Kind : " +kind+", Number :"+number;
		
	}
	public Object clone() {
		Object obj = null;
	 /*	try { obj = super.clone(); 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace(); 
			}*/
		Card org = new Card("Heart",7);

		return (Object)org;
}
}
public class Ex54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());	
		Card c3 = (Card) c2.clone();
		System.out.println("c3 "+c3+"  c2 "+c2);
	}
}

