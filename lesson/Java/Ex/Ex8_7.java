package Exam;

import java.util.Scanner;

public class Ex8_7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [][]aa = new int [3][4];
		int su = 1;
		int j =0;
		for(int i = 0; i<3;i++) {
			for(j = 0; j<4; j++) {
				aa[i][j]=su;
				su++;
			}
		}
		
		
		for(int i = 0; i<3;i++) {
			for(j = 0; j<4; j++) {
				System.out.printf("%3d ", aa[i][j]);
			}
			System.out.println();
		}

}
}
