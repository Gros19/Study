package Exam;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5_10BufferReader {
	public static void main(String[]args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String s = bf.readLine();
		int a = Integer.parseInt(bf.readLine());
//		bf.close();
		System.out.println("1~4 �� �����ϼ��� : ");
		
		
		switch(a) {
		case 1:
			System.out.println("1�� �����ߴ�.");
			break;
		case 2:
			System.out.println("2�� �����ߴ�.");
			break;
		case 3:
			System.out.println("3�� �����ߴ�.");
			break;
		case 4:
			System.out.println("4�� �����ߴ�.");
			break;
		default:	
			System.out.println("�� �Է��Ѱ�");
			break;
		
		}
	}

}
