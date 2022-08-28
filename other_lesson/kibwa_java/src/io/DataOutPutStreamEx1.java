package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutPutStreamEx1 {
    public static void main(String[] args) {
        int[] score = {100, 95, 85,75, 45};
        try{
            FileOutputStream fos = new FileOutputStream("D:\\Study\\other_lesson\\kibwa_java\\score.dat");
            DataOutputStream dos  = new DataOutputStream(fos);
            for(int i=0; i < score.length; i++){
                dos.writeInt((score[i]));
            }
            fos.close();
            dos.close();
        }catch (IOException ie){

        }
    }
}
