package basic;

import java.util.*;
public class ex8
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		int hap;
		
		System.out.print("첫 번째 숫자를 입력하세요:");
		a = s.nextInt();
		System.out.print("첫 번째 숫자를 입력하세요:");
		b = s.nextInt();
		System.out.print("첫 번째 숫자를 입력하세요:");
		c = s.nextInt();
		System.out.print("첫 번째 숫자를 입력하세요:");
		d = s.nextInt();
		hap = a + b + c + d;
		
		System.out.printf("합계 >>> %d \n", hap);
	}
}