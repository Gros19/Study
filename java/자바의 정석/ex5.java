package basic;

public class ex5
{
	public static void main(String[] args)
	{
		int a, b;
		char c, d;
		
		a = 0xF90A;
		b = 0x50;
		System.out.printf("%c\n",(char)a);
		
		c = (char) b;
		System.out.printf("%c\n", c);
		
		d = '#';
		System.out.printf("%c�� ASCIICODE ���� %d�Դϴ�.", d, (int)d);
	}
}