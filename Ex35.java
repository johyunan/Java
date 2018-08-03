class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		System.out.println("생성자 함수");
	}
	
	public static Singleton getInstance() {
		if( s == null ) {
			s = new Singleton();
		}
		return s;
	}
	
	void print() {
		System.out.println("출력.");
	}
	
}

public class Ex35 {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); //생성자가 private이기 때문
		Singleton s = Singleton.getInstance();
		s.print();
	}

}
