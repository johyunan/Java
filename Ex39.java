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
	MyFightable myfightable = new MyFightable();//위에서 구현해서 이렇게 쓸수도 있음. has a관계
	                                                          //하지만 이 것은 거의 implements를 통해서 사용한다. 
	                                                          //Why? 대부분 implements는 구현이 다 다르게 되기 때문에 이렇게 정해두고 쓰지 않는다.
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
		
		Fightable fightable = new Fighter(); //Fighter가 인터페이스를 구현
		fightable.move(10,100);
		fightable.attack(null);

	}

}
