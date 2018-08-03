import java.awt.*;
import javax.swing.*;

class TimerThread implements Runnable /*extends Thread*/{
	int value = 10000;//���ÿ� ������ �� ��� ���� ����(�����ڿ�)
	//--> �����ڿ��� ���� ������ ���� ���Ͽ� 
	//synchronized�� ����ϰų� wait(), notify() ���
	
	public void run() {
		int n = 0;
		while(true) {
			System.out.println(n + "value " + value);
			++n;
			synchronized(this) {//�����ڿ��� �ѹ��� �ϳ��� �����Ͽ� ����� �� �ִ�.
			value += n; // �ν��Ͻ� ������ ����
			} //�̰� ������� �ݵ�� �ϳ��� ������ �� �ֵ�.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//imterface Runnable ����ϴ� ��� �ʿ�(�ܺο��� �����带 �����ų��)
	void start() {
		Thread thread = new Thread(this); //runnable ���� Ŭ���� ���������ڷ� �־���
		thread.start();
	}	
}

public class Ex47 {

	public static void main(String[] args) {
		/*Thread�� ��ӹ޾Ƽ� ����ϴ� ���
		TimerThread t = new TimerThread();
		//TimerThread t2 = new TimerThread(); 
		  //�ν��Ͻ��� ������ ����� ���Ƿ� �ٸ� ������� �����Ѵ�.
		t.start();
		//t2.start();
		 * */ //��� �ν��Ͻ��� ��������� ����Ǵ°�
		//interface Runnable �̿��Ͽ� �����ϴ� ���
		TimerThread t = new TimerThread();
		t.start(); //thread�� �����ǰ� ����
		t.start(); //���ο� thread�� �����ǰ� ����
		//��� �����尡 ���� ��������� ����Ǵ� ��
	}

}
