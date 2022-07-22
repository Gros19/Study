package Exam;

public class Test {

	public static void main(String[] args) {
		int [] num = new int[10];
		int i = 0;
		while(i<10) {
		num[i] = 10*(i+1);
		i++;
		}
		for(i = 0;i<10;i++ ) {
			System.out.println(num[i]);
		}

	}

}
