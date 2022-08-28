package io;

import java.io.*;

public class FileReaderWriterEx {
    public static void main(String[] args) {

        try {//쓰기
            FileWriter fw = new FileWriter("D:\\Study\\other_lesson\\kibwa_java\\test.txt");
            fw.write("dafaf");
            fw.write("qwe23e23");
            fw.close();
        }catch (EOFException eof){
            System.out.println("종료");
        }
        catch (IOException e){
        }

        try {//읽기
            FileReader fr = new FileReader("D:\\Study\\other_lesson\\kibwa_java\\test.txt");
            int c;
            while ((c = fr.read()) != -1){

                if(c == '\n'){
                    System.out.println();
                }
                System.out.print((char)c);
            }
        }catch (EOFException eof){
            System.out.println("종료");
        }
            catch (IOException e){

        }
    }
}
