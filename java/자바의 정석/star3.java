package basic;

public class star3 {
/*
 * 
5 4		            04
3		         13 14 
2		      22 23 24
1		   31 32 33 34
0		40 41 42 43 44
1		   51 52 53 54
2		      62 63 64
3		         73 74
4		            84
 
5 4 
5 3 
5 2 
5 1 
5 0 
5 1 
5 2
5 3
5 4
(gong,col)
 4,0  4,1  4,2  4,3  4,4 
 3,0  3,1  3,2  3,3  3,4 
 2,0  2,1  2,2  2,3  2,4 
 1,0  1,1  1,2  1,3  1,4 
 0,0  0,1  0,2  0,3  0,4 
-1,0 -1,1 -1,2 -1,3 -1,4 
-2,0 -2,1 -2,2 -2,3 -2,4 
-3,0 -3,1 -3,2 -3,3 -3,4 
-4,0 -4,1 -4,2 -4,3 -4,4  
 * 
 * */
	public static void main(String[] args) {
		
		int gong=4;
		for(int row = 0; row < 9; row++ ) {
			
			for(int col = 0; col <= 4 ; col++) {
				if(col < gong  || (col + gong < 0 )) {
				System.out.print(" ");	
				}
				else {System.out.print("*");}
			}
			System.out.println();
			gong--;
		}
			
		

			

	

}
}