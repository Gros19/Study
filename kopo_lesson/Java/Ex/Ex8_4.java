package Exam;

import java.util.Scanner;

public class Ex8_4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] aa = {100, 200,300, 400};
		int[] bb = new int[] {100, 200, 300};
		int cc[];
		cc = new int[] {100, 200};
		int[] dd = new int[1];
		dd[0] = 100;
		int i =0;
		
		
		for(i = 0; i <= aa.length-1; i++) {
			System.out.println(aa[i]);
		}
		for(i=0; i<bb.length; i++)
			System.out.println(bb[i]);
		for(i=0; i<cc.length; i++)
			System.out.println(cc[i]);
		for(i=0; i<dd.length; i++)
			System.out.println(dd[i]);
		
	}

}
