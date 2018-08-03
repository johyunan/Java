interface Repairable{
	void repair(Repairable r);
}

class Unit{
	int x, y;
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
		
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public void repair(Repairable r) {
		hitPoint = MAX_HP;
		System.out.println("tank repair");		
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}
class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}

	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint !=u.MAX_HP) {
				++(u.hitPoint);
			}
			System.out.println("scv repair");
		}
	}
}

public class Ex40 {

	public static void main(String[]args) {
		Marine m = new Marine();
		Tank t = new Tank();
		SCV scv = new SCV();
		
		scv.repair(t); //�������̽��� ���ڰ��� �ް� �ֱ� ������, �׸��� implements�� ���־��� ������
		t.repair(null); //�ڱ� �ڽ����� �����ϴ� ��
		//scv.repair(m);
	}
}
