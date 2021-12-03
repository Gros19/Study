package Exam;

public class ex3_10 {
	public static void main(String[]args) {
		
		int a,b,c,d;
		
		a = 100+100;
		b = a+100;
		c = a+b-100;
		d = a+b+c;
		
		System.out.printf("a, b, c, d의 값 ..> %d, %d, %d, %d\n",a, b, c, d);
		
		a =b = c =d =100;
		
		System.out.printf("a, b, c, d의 값 ..> %d, %d, %d, %d\n",a, b, c, d);
		
		a= 100;
		a = a +200;
		System.out.println("a의 값,,,>"+a);
	}

}
