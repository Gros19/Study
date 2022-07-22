package Exam;

public class Paper4 {

	public static void main(String[] args) {
		int i = 3;
		int j= 1;
		while(i<9) {
			
			System.out.println(i+"*"+j+"="+i*j);
			j++;
			if(j>9) {
				j=1;
				i++;
			}
			
		}

	}

}
