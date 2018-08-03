
public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	MyTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//시간을 넘겨주는 함수
	int getHour() {	return hour;  }
	
	//시간 값을 수정해주는 함수
	void setHour(int hour) {
		//시간 범위 검사
		if(hour<0 || hour>23) return;
			this.hour = hour;
	}
	
	public String toString() {
		return hour + " : " + minute + " : " + second;
	}
}
