package Exam;
import java.util.Scanner;
public class Ex7_3 {
	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		int i, j;
		
		
		
		while(true) {
			i = scn.nextInt();
			j = scn.nextInt();
			System.out.printf("%d + %d = %d\n",i, j ,i+j);
			if(i+j>10)
				break;
			
		}
		System.out.println("end");
	}

}
