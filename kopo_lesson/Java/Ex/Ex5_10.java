package Exam;
import java.util.Scanner;
public class Ex5_10 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.println("1~4 중 선택하세요 : ");
		a = s.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1을 선택했다.");
//			break;
		case 2:
			System.out.println("2을 선택했다.");
			break;
		case 3:
			System.out.println("3을 선택했다.");
			break;
		case 4:
			System.out.println("4를 선택했다.");
			break;
		default:	
			System.out.println("뭘 입력한거");
			break;
		
		}
	}

}
