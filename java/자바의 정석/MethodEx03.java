package basic;

public class MethodEx03
{
	public static void sum(int a)
	{
		int sum = 0;
		for (int i = 0; i <= a; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void sum(int a, int b)
	{
		int sum = 0;
		for (int i = a; i <= b; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		
		sum(5, 20);
		sum(15);
	}
	
}