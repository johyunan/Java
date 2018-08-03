class Car{
	String color;
	int door;
	int x = 100;
	
	void print() {
		System.out.println("Car print");
	}
	void drive() {
		System.out.println("drive");
	}
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	int x = 119;
	
	void print() {//�޼ҵ� �������̵�
		System.out.println("FireEngine print");
	}
	void water() {
		System.out.println("water");
	}
}

class Ambulance extends Car{
	void siren() {
		System.out.println("siren");
	}
}



public class Ex37 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		car.drive();
		//car.water(); car�� Car Ŭ���� ���� ���� �̹Ƿ� water���� �Ұ�
		fe2 = (FireEngine)car;
		fe2.water();
		((FireEngine)car).water(); 
		
		if(car instanceof FireEngine) {//car�� FireEngine�� ��ӹ޴´�.
			System.out.println("FireEngine");
		}
		if( car instanceof Car) {//car�� car�� ��ӹ޴´�.
			System.out.println("Car");
		}
		if( car instanceof Object) {//��� Ŭ������ Object�� ��ӹ޴´�.
			System.out.println("Object");
		}
		
		System.out.println("fe x" + fe.x);
		System.out.println("car x" + car.x);
		fe.print();
		car.print();
	}

}
