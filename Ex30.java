class A {
	int a = 1;
	A(int data){
		a=data;
	}
}

class AB extends A{
	int b = 2;
	AB(){
		this(20);
		//super(100);
		//b=20;
	}
	AB(int value){
		super(999);
		b=value;
	}
}

class ABC extends AB{
	int c = 3;
	ABC(){
		c=30;
	}
}
public class Ex30 {
	public static void main(String[]args) {
		ABC obj = new ABC();
		
		System.out.println("obj.a " + obj.a);
		System.out.println("obj.b " + obj.b);
		System.out.println("obj.c " + obj.c);
	}
}
