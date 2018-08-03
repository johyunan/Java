import java.util.Vector;

//��ǰ Ŭ����
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



//������ �����ϴ� ����� Buyer Ŭ����
class Buyer{
	int money=10000;//��
	//Product[] cart = new Product[3];//��ٱ���
	Vector cart = new Vector();
	int count = 0;//��ٱ��� ������
	
	Buyer(int money){
		this.money = money;
	}
	
	//���ǻ��
	void buy() {
		int result = money - sum();
		if(result<0) {
			System.out.println("���� �����մϴ�.");
		}else {
			System.out.println("������ ����.");
			money = result;
			count =0;
		}
	}
	//��ٱ��� ���� �߰�
	void add(Product p) {
		//cart �迭�� �߰�
		/*if(count < cart.length) {
		cart[count] = p;
		++count;
		}else {
			System.out.println("���̻� �������� �����ϴ�");
		}*/
		cart.add(p);
	}
	//��ٱ��ϴ�� ��� ���� �հ豸�ϱ�
	int sum() {
		//cart �迭���� ��� ���� �հ� ���ϱ�
		int sumCart = 0;
		/*for(int i = 0; i<cart.length; ++i) {
			sumCart += cart[i].price;
		}*/
		for(int i = 0;i<cart.size(); ++i) {
			Product p = (Product)cart.get(i); //get(i)�� ���� object Ÿ������ ĳ���� ����� �ϴµ� �׷��� ��ü�� �׷��ϱ� (Product) ���ִ� ��
			sumCart += p.price;
			//sumCart += ((Product)cart.get(i)).price; //������ �ڵ�
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
