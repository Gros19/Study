package basic;

import java.util.*;
public class ex8
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		int hap;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���:");
		a = s.nextInt();
		System.out.print("ù ��° ���ڸ� �Է��ϼ���:");
		b = s.nextInt();
		System.out.print("ù ��° ���ڸ� �Է��ϼ���:");
		c = s.nextInt();
		System.out.print("ù ��° ���ڸ� �Է��ϼ���:");
		d = s.nextInt();
		hap = a + b + c + d;
		
		System.out.printf("�հ� >>> %d \n", hap);
	}
}