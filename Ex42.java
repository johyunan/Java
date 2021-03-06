interface MyMouseInterface {
	void Move();

	void click();
}

class MouseDriver implements MyMouseInterface {

	@Override
	public void Move() {
		System.out.println("mouse  move");
	}

	@Override
	public void click() {
		System.out.println("mouse click");
	}

	void getButton() {
		System.out.println("getButton()");
	}

}

class MyClass {
	void addListener(MyMouseInterface i) {
		System.out.println("my class");
	}
}

public class Ex42 {
	public static void main(String[] args) {
		MouseDriver m = new MouseDriver();
		m.click();
		m.Move();

		MyClass myclass = new MyClass();
		myclass.addListener(new MyMouseInterface() {

			@Override
			public void Move() {
				System.out.println("add Listener move");

			}

			@Override
			public void click() {
				System.out.println("add Listener click");
			}
		});
	}
}
