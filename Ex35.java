class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		System.out.println("������ �Լ�");
	}
	
	public static Singleton getInstance() {
		if( s == null ) {
			s = new Singleton();
		}
		return s;
	}
	
	void print() {
		System.out.println("���.");
	}
	
}

public class Ex35 {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); //�����ڰ� private�̱� ����
		Singleton s = Singleton.getInstance();
		s.print();
	}

}
