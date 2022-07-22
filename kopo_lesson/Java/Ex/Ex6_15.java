package Exam;

public class Ex6_15 {
	public static void main(String [] args) {
		for(int i =0;i<10;i++) {
			for(int j=2; j<10;j++) {
				if(i==0)
					System.out.print("    "+j+"´Ü        ");
				else
					System.out.printf("%-2d*%2d = %2d ",j, i, j*i);
			}
		System.out.println();
	}
	}
}
