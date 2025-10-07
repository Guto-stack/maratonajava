package javacore.Eio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt"); 
        try(FileWriter fw = new FileWriter(file)){
            BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Bom Dia Galerinha!!!");
        bw.newLine();
        bw.flush();
        
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
