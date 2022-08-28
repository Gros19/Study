package thread;

public class TreadEx3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx3_1 th1 = new ThreadEx3_1();
		ThreadEx3_2 th2 = new ThreadEx3_2();
		
		/*
		 * th2.setPriority(7); //우선순위 기본값: 5(1~10)
		 * 
		 * System.out.println("Priority of th1(-): " + th1.getPriority());
		 * System.out.println("Priority of th2(|): " + th2.getPriority()); th1.start();
		 * th2.start();
		 */
		
		/*
		 * th1.start(); try { th1.join(); //두 쓰레드가 번갈아 실행하지 않고 순차적으로 실행할때 사용 } catch
		 * (Exception e) { // TODO: handle exception }
		 * 
		 * th2.start();
		 */
		
		th1.start();
		th2.start();
		try {
			th1.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("<<메인 종료>>");

	}

}
