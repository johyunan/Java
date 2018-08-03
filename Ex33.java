import java.util.Vector;

//상품 클래스
class Product{
	int price;
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
}


class Audio extends Product{
	Audio(){
		super(10);
	}
}



//물건을 구입하는 사람을 Buyer 클래스
class Buyer{
	int money=10000;//돈
	//Product[] cart = new Product[3];//장바구니
	Vector cart = new Vector();
	int count = 0;//장바구니 담은수
	
	Buyer(int money){
		this.money = money;
	}
	
	//물건사기
	void buy() {
		int result = money - sum();
		if(result<0) {
			System.out.println("돈이 부족합니다.");
		}else {
			System.out.println("물건을 샀어요.");
			money = result;
			count =0;
		}
	}
	//장바구니 물건 추가
	void add(Product p) {
		//cart 배열에 추가
		/*if(count < cart.length) {
		cart[count] = p;
		++count;
		}else {
			System.out.println("더이상 담을수가 없습니다");
		}*/
		cart.add(p);
	}
	//장바구니담긴 모든 물건 합계구하기
	int sum() {
		//cart 배열에서 모든 물건 합계 구하기
		int sumCart = 0;
		/*for(int i = 0; i<cart.length; ++i) {
			sumCart += cart[i].price;
		}*/
		for(int i = 0;i<cart.size(); ++i) {
			Product p = (Product)cart.get(i); //get(i)를 쓰면 object 타입으로 캐스팅 해줘야 하는데 그러면 전체가 그러니까 (Product) 해주는 것
			sumCart += p.price;
			//sumCart += ((Product)cart.get(i)).price; //개발자 코드
		}
		return sumCart;
	}
}


public class Ex33 {

	public static void main(String[] args) {
		Product p1 = new Tv();
		Product p2 = new Computer();
		Product p3 = new Audio();
		
		Buyer buyer = new Buyer(5000);
		
		buyer.add(p1);
		buyer.add(p2);
		buyer.add(p3);
		
		buyer.buy();
		
	}

}
