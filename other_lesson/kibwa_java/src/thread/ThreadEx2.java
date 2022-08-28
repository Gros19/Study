package thread;

public class ThreadEx2 extends Thread {
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);	//1000 = 1초
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
