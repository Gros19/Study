package thread;

public class ThreadEx1_1 extends Thread{
	public void run() {
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println(getName());
	}
}
