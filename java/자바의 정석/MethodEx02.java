package basic;

public class MethodEx02 
{
	public static int div()
	{
		int a = 10, b = 5;
		int result = a / b;
		int result2 = a * b;
		
		return result;	//ȣ���� ������ �� ��ȯ
//		return result2	//������ ����
	}
	
	public static void main(String[] args)
	{
		System.out.println(div());
	}
}
