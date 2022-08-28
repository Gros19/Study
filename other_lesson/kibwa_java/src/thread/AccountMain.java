package thread;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * AccountThread th1 = new AccountThread(); AccountThread th2 = new
		 * AccountThread();
		 */
		Runnable r = new AccountThread();		//한 계좌에서 출금발생
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.start();
		System.out.println("1end");
		th2.start();
		System.out.println("2end");
	}

}
