package Exam;
import java.util.Scanner;
public class ex5_7 {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int a;
		
		System.out.println("������ �Է��ϼ���: ");
		a=scn.nextInt();
		
		if(a>50) {
			if(a<100)
				System.out.println("50���� ũ�� 100���� �۱���");
			else
				System.out.println("��~~ 100���� ũ����..");
		}
		else
			System.out.println("�ƽ����� 50���� �۾ƿ�");
		
	}	

}
