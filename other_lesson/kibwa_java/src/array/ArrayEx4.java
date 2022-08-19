package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[][] score = {
                  { 90, 85, 65}
                , { 20, 76, 100}
                , { 30, 30, 30}
                , { 40, 80, 90}
                , { 100, 70, 58}};

        int koTot = 0;
        int engTot = 0;
        int mathTot = 0;

        /*성적표 제목출력*/
        System.out.println("번호\t국\t영\t수\t총점\t평균");
        System.out.println("_________________________________");

        /*학생별 총점, 평균 구하여 출력*/
        //012
        for(int i = 0; i < score.length; i++){

            //01234
            for(int j = 0; j < score[i].length; j++){
                switch (j){
                    case 0:
                        koTot = score[i][j];
                        break;
                    case 1:
                        engTot = score[i][j];
                        break;
                    case 2:
                        mathTot =score[i][j];
                        break;
                }
            }
            int sum = koTot + engTot+ mathTot;
            System.out.println(i+"\t"+koTot+"\t"+engTot+"\t"+mathTot +"\t"+sum + "\t"+(double)sum/3);

        }
    }
}
