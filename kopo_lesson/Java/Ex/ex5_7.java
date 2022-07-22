package Exam;
import java.util.Scanner;
public class ex5_7 {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int a;
		
		System.out.println("점수를 입력하세요: ");
		a=scn.nextInt();
		
		if(a>50) {
			if(a<100)
				System.out.println("50보다 크고 100보다 작군요");
			else
				System.out.println("와~~ 100보다 크군요..");
		}
		else
			System.out.println("아쉽지만 50보다 작아요");
		
	}	

}
