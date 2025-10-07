package javacore.Eio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt"); 
        try(FileWriter fw = new FileWriter(file)){
        fw.write("Bom Dia Galerinha!!!");
        fw.flush();
        
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
