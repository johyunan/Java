class Tv{
	boolean power;
	int channel;
	void power() { power =! power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	 String text;
	 void caption() {System.out.println("caption("); }
}


public class Ex36 {

	public static void main(String[] args) {
		CaptionTv c = new CaptionTv();
		c.caption();
		Tv t = new CaptionTv();//생성자는 child 클래스를 통하여 생성하므로 caption 변수/함수 생성
		t.channelUp(); //Tv 클래스 내용 모두 사용가능
		//t.caption(); //CaptionTv 사용 불가 //자식의 것을 사용할수는 없다. 

		Tv t2 = new CaptionTv();
		//CaptionTv c2 = new TV(); // 사용불가 왜? child가 더 많은 내용(멤버변수, 함수) 가지고 있으므로 
		//c2.caption();//위의 것이 사용 불가한 이유 : 이런식으로 사용할 수 없기 때문에 
		
	}

}
