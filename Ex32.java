/*
 * Robot Ŭ���� ����
 * DanceRobot, SingRobot, DrawRobot ���� ---> Robot ��� �޴´�
 * DanceRobot -> dance(), SingRobot -> sing() DrawRobot -> draw()
 */

class Robot{
	void print() {
		System.out.println("Robot �Դϴ�");
	}
}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("dance");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("sing");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("draw");
	}
}


public class Ex32 {

	public static void main(String[] args) {
		DanceRobot d = new DanceRobot();
		SingRobot s = new SingRobot();
		DrawRobot dd = new DrawRobot();
		
		d.print();
		d.dance();
		s.sing();
		dd.draw();
		dd.print();
	}

}
