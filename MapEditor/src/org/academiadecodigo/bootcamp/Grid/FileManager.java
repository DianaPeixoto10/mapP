package org.academiadecodigo.bootcamp.Grid;

import com.sun.corba.se.impl.io.InputStreamHook;

import java.io.*;
import java.util.Map;

/**
 * Created by codecadet on 11/06/2018.
 */
public class FileManager implements Serializable {


    InputStream inputStream;
    OutputStream outputStream;

    public void write() {
        try {
            MapEditor mapEditor = new MapEditor();
            outputStream = System.out;
            ObjectOutputStream objectInputStream = new ObjectOutputStream(outputStream);
            objectInputStream.writeObject(mapEditor);
            objectInputStream.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void read() {
        try {
            inputStream = new FileInputStream("src/Paint.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            MapEditor mapEditor = (MapEditor) objectInputStream.readObject();
            System.out.println(mapEditor);
            objectInputStream.close();
            inputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException cf) {
            System.out.println(cf.getMessage());

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
    }

