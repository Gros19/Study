package thread;

public class ThreadEx3_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.println(" - ");
			//for(int x = 0; x < 100000000; x++);
		}
		System.out.println("<<th1 종료>>");
	}
}
