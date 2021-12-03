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
		System.out.println("1~4 중 선택하세요 : ");
		
		
		switch(a) {
		case 1:
			System.out.println("1을 선택했다.");
			break;
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
