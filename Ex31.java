class Unit{
	int x, y;//.......
	void move(int x, int y) {
		System.out.println("move(" + x + "," + y + ")");
	}
	void stop() {
		System.out.println("stop");
	}
}


class Marine extends Unit { // 보병
	void stimPack() {
		System.out.println("보병 stimPack");
	}
}

class Tank extends Unit{
	void changeMode() {
		System.out.println("tank changeMode");
	}
}

class Dropship extends Unit{
	void load() {
		System.out.println("Dropship load");
	}
	void unload() {
		System.out.println("Dropship unload");
	}
}

public class Ex31 {

	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		
		m.move(100, 50);
		t.move(20, 60);
		d.move(90, 100);
		
		m.stimPack();
		t.changeMode();
		d.load();
		
		m.stop();
		t.stop();
		d.stop();
	}

}
