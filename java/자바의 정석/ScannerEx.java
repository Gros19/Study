package basic;

import java.util.Scanner;
public class ScannerEx
{
	public static void main(String[] args)
	{
		int a, b;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �Է����ּ���:");
		a = s.nextInt();
		System.out.println("���� �ٽ� �Է����ּ���:");
		b = s.nextInt();
		
		result = a + b;
		System.out.println(a+"+"+b+"="+result);
		
	}
}