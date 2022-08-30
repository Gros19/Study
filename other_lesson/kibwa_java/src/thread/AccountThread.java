package thread;

import java.util.Scanner;

public class AccountThread implements Runnable{
	Account acc = new Account();
	public void run() {
		Scanner scn = new Scanner(System.in);
		int money = 0;

		synchronized (this) {
		while(acc.balance > 0) {
			System.out.println();
			if (acc.lock == -1) {
				acc.lock = 1;
				System.out.print("--출금할 금액을 입력하세요: ");
				money = scn.nextInt();
				System.out.println();
				acc.withdraw(money);
				acc.lock = -1;
			}

			if (acc.lock == -1) {
				acc.lock = 1;
				System.out.print("--입금할 금액을 입력하세요: ");
				money = scn.nextInt();
				System.out.println();
				acc.deposit(money);
				acc.lock = -1;
			}
		}

		}
	}
}
