package Exam;

public class Mid_Q6 {

	public static void main(String[] args) {
  /*
   * 
   
####*####
###***###
##*****##
#*******#
*********
#*******#
##*****##
###***###
####*####

 8 4 7 4 6 4 5 4 4 4 3 4 2 4 1 4 0 4
 8 3 7 3 6 3 5 3 4 3 3 3 2 3 1 3 0 3
 8 2 7 2 6 2 5 2 4 2 3 2 2 2 1 2 0 2
 8 1 7 1 6 1 5 1 4 1 3 1 2 1 1 1 0 1
 8 0 7 0 6 0 5 0 4 0 3 0 2 0 1 0 0 0
 8-1 7-1 6-1 5-1 4-1 3-1 2-1 1-1 0-1
 8-2 7-2 6-2 5-2 4-2 3-2 2-2 1-2 0-2
 8-3 7-3 6-3 5-3 4-3 3-3 2-3 1-3 0-3
 8-4 7-4 6-4 5-4 4-4 3-4 2-4 1-4 0-4


   * */
	      int gong=4;
	      for(int row = 0; row < 9; row++ ) {
	         
	         for(int col = 8; col >= 0 ; col--) {
	        	 
	        		 if(col+gong>=9||col-gong>=9)
	        			 System.out.print(" ");
	        		 else if(gong-col>=1||gong+col<=-1)
	        			 System.out.print(" ");
	        		 else
	        			 System.out.print("*");
	        		
	        			 
	         }
	         System.out.println();
	         gong--;
	      }


	}

}
