package io;

import java.io.*;

public class StringWriterReaderEx {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        try {
             bw = new BufferedWriter(new FileWriter("D:\\Study\\other_lesson\\kibwa_java\\String.txt"));
             bw.write("현재 대출 금액 750만원");
             bw.newLine();
             bw.write("금리 좀 그만 올라");
             bw.write("기사 제보 및 보도자료");
             bw.newLine();
             bw.write("출처 나 작성자");
            bw.close();
        }catch (IOException ie){

        }finally {
            System.out.println("기상 입력 완료");
        }

        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("D:\\Study\\other_lesson\\kibwa_java\\String.txt"));
            String s = br.readLine();
            while (s != null){
                System.out.println(s);
                s = br.readLine();
            }
        }catch (EOFException eof){
            System.out.println("파일을 다 읽었어요");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(br != null){
                System.out.println("종료");
                br.close();
            }
        }

    }

}
