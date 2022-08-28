package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutPutStreamEx {
    public static void main(String[] args)  {

        FileOutputStream fos;
        BufferedOutputStream bos;
        try{
            fos = new FileOutputStream("D:\\Study\\other_lesson\\kibwa_java\\123.txt");
            bos = new BufferedOutputStream(new FileOutputStream("D:\\Study\\other_lesson\\kibwa_java\\1222.txt"), 5);
            for(int i = '1'; i < '9'; i++){
                fos.write(i);
                bos.write(i+1);
            }
            fos.write("234".getBytes());
            fos.close();
            bos.close();
        }catch (IOException ie){

        }finally {
        }
    }
}
