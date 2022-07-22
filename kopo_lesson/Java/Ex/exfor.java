package Exam;

public class exfor {

	public static void main(String[] args) {

		/*
		 * for(int i =1; i<11; i++) {
			if(i%3==0) {
				System.out.println("[3ÀÇ ¹è¼ö ] ");
			}
			System.out.println(i);
		}
		 *
		 */
		for(int i=1; i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i);
			}
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}

	}

}
