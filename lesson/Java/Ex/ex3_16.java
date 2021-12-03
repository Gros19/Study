package Exam;

public class ex3_16 {
	public static void main(String[]args) {
		
		char a,b,c,d,e;
		
		
		a = 'A';
		
		System.out.printf("%c \t",a);
		System.out.println((int)a);
		
		b ='a';
		c =(char)(b+1);
		
		System.out.printf("%c \t",b);
		System.out.println(c);
		
		d=90;
		System.out.println(d);
		d='°¡';
		e=(char)(d+1);
		System.out.print((int)d+"\t");
		System.out.println(e);
		e=44036;
		System.out.println((char)e);
	}

}
