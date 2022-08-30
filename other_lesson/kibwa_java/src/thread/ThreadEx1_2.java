package thread;

public class ThreadEx1_2 implements Runnable{
	public void run() {
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
