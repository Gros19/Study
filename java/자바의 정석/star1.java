package basic;
import java.util.Scanner;
public class star1 {
/*
 * 

(col,gong)
 4, 4 
 4, 3  3, 3 
 4, 2  3, 2  2, 2 
 4, 1  3, 1  2, 1  1, 1 
 4, 0  3, 0  2, 0  1, 0  0, 0 
 4,-1  3,-1  2,-1  1,-1 
 4,-2  3,-2  2,-2 
 4,-3  3,-3 
 4,-4 


 * 
 * */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("별의 넓이를 얼마나 할래요?");
		int width = scn.nextInt();
		int gong=width-1;
		for(int row = 0; row < width*2-1; row++ ) {
			for(int col= width-1;; col--) {
				System.out.print("*");
				if(col + gong == 0 || col - gong == 0) {break;}
			}
			System.out.println();
			gong--;
			
		}
}
			

	

}
