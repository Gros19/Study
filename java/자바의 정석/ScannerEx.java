package basic;

import java.util.Scanner;
public class ScannerEx
{
	public static void main(String[] args)
	{
		int a, b;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요:");
		a = s.nextInt();
		System.out.println("값을 다시 입력해주세요:");
		b = s.nextInt();
		
		result = a + b;
		System.out.println(a+"+"+b+"="+result);
		
	}
}