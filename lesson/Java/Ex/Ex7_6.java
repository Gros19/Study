package Exam;
import java.util.Scanner;
public class Ex7_6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu=0;
		
		do {
			
			System.out.println("<1>ī���\n<2>īǪġ��\n<3>�Ƹ޸�ī��\n<4>�ƴ� �׳� ��������\n:");
			menu = scn.nextInt();
			switch(menu) {
			case 1:
				System.out.println("#ī��� �ֹ��ϼ̽��ϴ�.\n"); break;
			case 2:
				System.out.println("#īǪġ�� �ֹ��ϼ̽��ϴ�.\n"); break;
			case 3:
				System.out.println("#�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.\n"); break;
			case 4:
				System.out.println("#��.\n"); break;
			default:
				System.out.println("�߸� �ֹ��ϼ̽��ϴ�.\n");
			
			}
		}
		
		while(menu!=4);
		
	}

}
