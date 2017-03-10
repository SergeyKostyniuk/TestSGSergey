package ua.sergey.kostyniuk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cteniefayla {

 
    public static void main(String[] args) throws IOException {
        String fileName = "адреса.txt";
        
         
        String contents = readUsingBufferedReader(fileName);
        System.out.println(contents);
        System.out.println(contents.length());
    }
 
   
    private static String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }
        
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
 
}     