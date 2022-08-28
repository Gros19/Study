package thread;

public class ThreadEx1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1_1 th1 = new ThreadEx1_1();
		
//		Runnable r = new ThreadEx1_2();
//		Thread th2 = new Thread(r);
		Thread th2 = new Thread(new ThreadEx1_2());
		
		th1.start();		//쓰레드 실행 명령
		th2.start();		//쓰레드 실행 명령
		
	}

}
