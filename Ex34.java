class Card{
	final int NUMBER;
	final String KIND;
	static int sidth = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	public String toString() {
		return " " + KIND + " , " + NUMBER;
	}
}


public class Ex34 {
	public static void main(String[]args) {
		Card c = new Card("Heart", 7);
		
		System.out.println(c.toString());
		//c.KIND = "S";
		//c.NUMBER = 5;
		
		MyTime t = new MyTime(10,40,2);
		
		System.out.println(t.toString());
		
		//t.hour = 10; // hour -> private ��� �ȵ� //�����ڸ� public ���� �ϸ� �̰͵� ����� �� ����.
		t.setHour(11);
		System.out.println(t.getHour());
		
	}
}
