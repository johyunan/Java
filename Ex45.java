class MyThread implements Runnable{
	Thread thread;
	boolean suspended = false;
	boolean stopped = false;
	
	MyThread(String name){
		thread = new Thread(this, name);
	}
	
	@Override
	public void run() {
		while( !stopped) {
			if( !suspended) {
				System.out.print(".");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void suspend() { suspended = true; System.out.print("suspend");}
	public void resume() { suspended = true; System.out.print("resume");}
	public void stop() { stopped = true; System.out.print("stop"); }
	public void start() { thread.start(); System.out.print("start"); }
	
}


public class Ex45 {

	public static void main(String[] args) {
		MyThread mythread = new MyThread("thread");
		
		mythread.start();
		try {
			
			Thread.sleep(2000);
			mythread.suspend();
			Thread.sleep(1000);
			mythread.resume();
			mythread.stop();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mythread.suspend();

	}

}
