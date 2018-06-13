package org.academiadecodigo.bootcamp.Grid;

import java.io.*;
import java.util.Map;

/**
 * Created by codecadet on 11/06/2018.
 */
public class FileManager implements Serializable {

        MapEditor mapEditor;
        FileReader fileReader;
        FileWriter fileWriter;


        public void read() throws IOException{
                fileReader.read();
        }

        public void write() {
                fileWriter.write(int c);
        }

}
