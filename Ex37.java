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
	
	void print() {//메소드 오버라이딩
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
		//car.water(); car는 Car 클래스 참조 변수 이므로 water접근 불가
		fe2 = (FireEngine)car;
		fe2.water();
		((FireEngine)car).water(); 
		
		if(car instanceof FireEngine) {//car은 FireEngine을 상속받는다.
			System.out.println("FireEngine");
		}
		if( car instanceof Car) {//car은 car을 상속받는다.
			System.out.println("Car");
		}
		if( car instanceof Object) {//모든 클래스는 Object를 상속받는다.
			System.out.println("Object");
		}
		
		System.out.println("fe x" + fe.x);
		System.out.println("car x" + car.x);
		fe.print();
		car.print();
	}

}
