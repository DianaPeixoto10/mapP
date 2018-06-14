package org.academiadecodigo.bootcamp.Grid;

import com.sun.corba.se.impl.io.InputStreamHook;

import java.io.*;
import java.util.Map;

/**
 * Created by codecadet on 11/06/2018.
 */

public class FileManager implements Serializable {

    MapEditor mapEditor;

    File file = new File("/src/paint");
    FileInputStream inputStream;
    ObjectInputStream objectInputStream;
    FileOutputStream outputStream;
    ObjectOutputStream objectOutputStream;

    public void write() {
        try {
            MapEditor mapEditor = new MapEditor();
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(mapEditor);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (FileNotFoundException fn) {
            fn.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void read() {

        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);

            mapEditor = (MapEditor)objectInputStream.readObject();
            objectInputStream.close();

        } catch (FileNotFoundException fn) {
            fn.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException cf) {
            cf.printStackTrace();

        }
    }
}




   /* FileInputStream fileReader;
    FileOutputStream fileWriter;


    public void read() {
        try {
            fileReader = new FileInputStream("Paint");
            int b = fileReader.read();
            if (b == -1) {
                fileReader.close();
            }

            byte[] buffer = new byte[1024];
            int num = fileReader.read(buffer);

            if (num != -1) {
                System.out.println("I have read this may bytes: " + num);
            }

            fileReader.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void write() {
        try {
            fileWriter = new FileOutputStream("Paint");
            byte b = 0x37;
            fileWriter.write(b);
            byte[] buffer = .getBytes();
            fileWriter.write(buffer);
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/


