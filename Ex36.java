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
		Tv t = new CaptionTv();//�����ڴ� child Ŭ������ ���Ͽ� �����ϹǷ� caption ����/�Լ� ����
		t.channelUp(); //Tv Ŭ���� ���� ��� ��밡��
		//t.caption(); //CaptionTv ��� �Ұ� //�ڽ��� ���� ����Ҽ��� ����. 

		Tv t2 = new CaptionTv();
		//CaptionTv c2 = new TV(); // ���Ұ� ��? child�� �� ���� ����(�������, �Լ�) ������ �����Ƿ� 
		//c2.caption();//���� ���� ��� �Ұ��� ���� : �̷������� ����� �� ���� ������ 
		
	}

}
