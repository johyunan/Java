class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 3000; ++i) {
			System.out.print(" " + i);
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i = 0; i<3000; ++i) {
			System.out.print("|");
		}
	}
}

public class Ex44 {

	public static void main(String[] args) {
		MyThread th = new MyThread();
		MyThread2 th2 = new MyThread2();
		th.start();
		System.out.println("main~~1");
		th2.start();
		System.out.println("main~~2");
	}

}
