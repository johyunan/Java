
public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	MyTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//�ð��� �Ѱ��ִ� �Լ�
	int getHour() {	return hour;  }
	
	//�ð� ���� �������ִ� �Լ�
	void setHour(int hour) {
		//�ð� ���� �˻�
		if(hour<0 || hour>23) return;
			this.hour = hour;
	}
	
	public String toString() {
		return hour + " : " + minute + " : " + second;
	}
}
