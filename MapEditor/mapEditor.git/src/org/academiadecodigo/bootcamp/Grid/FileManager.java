package org.academiadecodigo.bootcamp.Grid;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileManager {

    FileInputStream inputStream = null;
    ObjectInputStream objectInputStream = null;

    public Grid read() throws IOException {


        int b = inputStream.read();

        while (b != -1) {
            try {
                byte[] bytes = new byte[1024];
                int num = inputStream.read(bytes);
                if (num != -1) {
                    System.out.println("I have read this many bytes: " + num);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        inputStream.read();
        inputStream.close();
        return new Grid();
    }

    public void write(Grid grid) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("MapEditor");

        byte[] buffer = grid.getBytes();
        fileOutputStream.write(b);
    }
    //https://www.mkyong.com/java/how-to-read-an-object-from-file-in-java/

}
