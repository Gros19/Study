package Exam;

import java.util.Scanner;

public class Ex8_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] aa = new int[4];
		int hap= 0;
		
		for(int i = 0; i <= 3; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요: ");
			aa[i] = scn.nextInt();
			hap += aa[i];
		}
		
		System.out.println(hap);
	}

}
