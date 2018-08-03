interface Fightable{
	void move(int x, int y);
	void attack(Unit u);
}

class Unit{
	int x, y;
}

class MyFightable implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
}



class Fighter extends Unit implements Fightable{
	MyFightable myfightable = new MyFightable();//������ �����ؼ� �̷��� ������ ����. has a����
	                                                          //������ �� ���� ���� implements�� ���ؼ� ����Ѵ�. 
	                                                          //Why? ��κ� implements�� ������ �� �ٸ��� �Ǳ� ������ �̷��� ���صΰ� ���� �ʴ´�.
	@Override
	public void move(int x, int y) {
		System.out.println("move");
	}

	@Override
	public void attack(Unit u) {
		System.out.println("attack");
	}
}

public class Ex39 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 5);
		f.attack(null);
		
		Fightable fightable = new Fighter(); //Fighter�� �������̽��� ����
		fightable.move(10,100);
		fightable.attack(null);

	}

}
