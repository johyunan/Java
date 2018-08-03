class A{
	public void methodA(I i) {
		i.methodB();
	}
}

interface I { void methodB(); }

class B implements I{
	public void methodB() {
			System.out.println("methodB in B");
	}
}

class C implements I{

	@Override
	public void methodB() {
		System.out.println("methodB in C");
		
	}	
}

public class Ex41 {
	
	public static void maint(String[]args) {
		A a = new A();
		B b = new B();
		a.methodA(b);
		a.methodA(new C());
		
	}

}
