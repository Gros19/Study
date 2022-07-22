package Exam;

public class Mid_Q5 {

	public static void main(String[] args) {
		int sum=1;
		for(int i=2; i<11; i++) {
			if(i%4!=0)
				sum+=i;
		}
		System.out.println(sum);
	}

}
