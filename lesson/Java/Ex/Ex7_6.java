package Exam;
import java.util.Scanner;
public class Ex7_6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu=0;
		
		do {
			
			System.out.println("<1>카페라떼\n<2>카푸치노\n<3>아메리카노\n<4>아니 그냥 나갈래요\n:");
			menu = scn.nextInt();
			switch(menu) {
			case 1:
				System.out.println("#카페라떼 주문하셨습니다.\n"); break;
			case 2:
				System.out.println("#카푸치노 주문하셨습니다.\n"); break;
			case 3:
				System.out.println("#아메리카노 주문하셨습니다.\n"); break;
			case 4:
				System.out.println("#어.\n"); break;
			default:
				System.out.println("잘못 주문하셨습니다.\n");
			
			}
		}
		
		while(menu!=4);
		
	}

}
