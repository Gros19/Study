package array;

/*
1. 40개 방을 생성
2. 1~45 초기화
3. 임의의 6개 방 추출
- 가짜난수와 중복의 문제

3 -> 임의의 방 번호(0~44)를 출출하여 [0] 방의 값과 교환(수천번 반복)
 */
public class RandArrayEX2 {
    public static void main(String[] args) {
        int[] box = new int[45];

        /*box 45개의 방에 1~45 초기화*/
        for(int i = 0; i < 45; i++){
            box[i] = (i+1);
        }

        /*방 교환에 사용하는 변수*/
        int tmp = 0;


        /*방을 바꾸는 횟수*/
        int n = (int)(Math.random()*100)+50;
        /*마지막 인덱스*/
        int end = box.length-1;
        System.out.println("방 교환 횟수: " + n);
        for(int i = 0 ; i <n; i++){
            int before = (int)(Math.random()*45);
            int after = (int)(Math.random()*45);

             tmp = box[before];
             box[before] = box[0];
             box[0] = tmp;

            tmp = box[after];
            box[after] = box[end];
            box[end] = tmp;

        }

        System.out.println("------------");
        for(int i = 0; i<6; i++){
            int choice = (int)(Math.random()*45);
            if(box[choice] == -1){
                System.out.println("중복");
                i--;
                continue;
            }
            System.out.print(box[choice]+"\t");
            box[choice] = -1;

        }


    }
}
