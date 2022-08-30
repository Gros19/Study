package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException {

        if(args.length <1){
            System.out.println("인자가 없어요");
            return;
        }
        FileInputStream fi = new FileInputStream(args[0]);
        FileOutputStream fo = new FileOutputStream(args[1]);
        int data = 0;
        while ((data=fi.read()) != -1){ // -1 EOF  End of File
            // 아직 읽어 내용이 있다.
            char c = (char)data;
            if(c == '\n'){
                System.out.println();
            }
            System.out.print(c);
            fo.write(c);
        }
        fo.close();
        fi.close();

    }
}
