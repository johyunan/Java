class Account {
	int balance = 1000;

	public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}

class MyThread implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		synchronized (this) {//�̰� ������ -���� ���´�. Why? �ӵ��� �޶� �̹� ifȮ���ϰ� ���Դµ� ó���� ���ϰ� �ȴ�?
			                      //�׷��� �̰� �־��ָ� �ϳ��� ������ ���� ��ٷȴٰ� �����ϹǷ� ������.
			while (acc.balance > 0) {
				int money = (int) (Math.random() * 3 + 1) * 100;
				acc.withdraw(money);
				System.out.println("balance : " + acc.balance);
			}

		}
	}

	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}

}

public class Ex46 {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();//main ������ start������ ���൵ ������. ���� �Լ����ٰ� ���ָ� ������ �Ͼ
		thread.start();
		thread.start();

	}

}
