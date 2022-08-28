package thread;

//계좌 클래스
public class Account {
	int balance = 10000;
	static int lock = -1;
	
	//출금 메소드
	//public synchronized void withdraw(int money) {		동기화 방법 1
	public void withdraw(int money) {						//동기화 방법 2
		synchronized (this) {
			if (balance >= money) {
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(money+" 출금");

				balance -= money;

				System.out.println("--잔액--: " + balance);
			}
		}//동기화 블럭
	}

	public void deposit (int money) {						//동기화 방법 2
		synchronized (this) {
			if (money > 0) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(money+" 입금");
				balance += money;

				System.out.println("--잔액--: " + balance);
			}else {
				System.out.println("--금액이 올바르지 않습니다. -"+money+"-");
			}
		}//동기화 블럭
	}
}

//입금 메소드 구현(동기화처리)