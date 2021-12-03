package basic;

public class MethodEx01 
{
	public static void sum() 
	{
		int sum = 0;
		for (int i = 0; i < 10; i++) 
		{
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		sum();
		sum();
		sum();
	}

}
