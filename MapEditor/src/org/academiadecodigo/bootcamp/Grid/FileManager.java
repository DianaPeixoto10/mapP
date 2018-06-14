package org.academiadecodigo.bootcamp.Grid;

import com.sun.corba.se.impl.io.InputStreamHook;

import java.io.*;
import java.util.Map;

/**
 * Created by codecadet on 11/06/2018.
 */

public class FileManager {

    /*MapEditor mapEditor;

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
}*/

    File file;
    FileReader fileReader;
    BufferedReader bufferedReader;

    FileWriter fileWriter;
    BufferedWriter bufferedWriter;

    public void read() {

        try {
            fileReader = new FileReader(file = new File("resources/Paint.txt"));
            bufferedReader = new BufferedReader(fileReader);

            char[] buffer = new char[1024];
            int num = fileReader.read(buffer);

            System.out.println(num);

            bufferedReader.close();
            fileReader.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void write() {
        try {
            String text = new String();
            fileWriter = new FileWriter("resources/Paint.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(text);
            bufferedWriter.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

