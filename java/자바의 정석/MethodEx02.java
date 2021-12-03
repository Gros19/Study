package basic;

public class MethodEx02 
{
	public static int div()
	{
		int a = 10, b = 5;
		int result = a / b;
		int result2 = a * b;
		
		return result;	//호출한 곳으로 값 반환
//		return result2	//컴파일 에러
	}
	
	public static void main(String[] args)
	{
		System.out.println(div());
	}
}
