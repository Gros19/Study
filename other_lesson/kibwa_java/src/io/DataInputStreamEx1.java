package io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        DataInputStream dis = null;
        try {

            dis = new DataInputStream(new FileInputStream("D:\\Study\\other_lesson\\kibwa_java\\score.dat"));
            int score;
            while ((score = dis.read()) != -1){
                System.out.println(score);
                if(score != 0){
                    sum += score;
                }
            }
            System.out.println("점수의 총합: "+ sum + "점 입니다.");
        }catch (EOFException e){ /*파일을 다 읽으면 발생*/

        } catch (IOException ie){

        } finally {
            if(dis != null){
                dis.close();
            }
        }// finally
    }//main
}
