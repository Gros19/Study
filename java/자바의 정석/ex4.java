package basic;

public class ex4
{
	public static void main(String[] args)
	{
		char a, b, c, d, e;
		a = 'A';
		System.out.printf("%c\n",  a);
		System.out.printf("%d\n", (int)a);
		
		b = 'a';
		c = (char)(b+1);
		System.out.printf("%c\t%d\n", b,(int)b);
		System.out.printf("%c\t%d\n", c, (int)c);
		
		d = 90;
		System.out.printf("%c\n", d);
		
		d = '°¡';
		e = (char) (d+1);
		System.out.printf("%d\n ",(int)d);
		System.out.printf("%c \n", e);
	}
}