package ua.sergey.kostyniuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner; //при використанні "Scanner"

public class Palindrom {

	public static void main(String[] args)throws IOException{
		System.out.println("Введіть строку");
		
		BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
		String s = rd.readLine();
		
    //  Scanner scan = new Scanner(System.in); // або так)
    //  String s = scan.next();   
		
		perevirka(s);
	}
    public static String zvorotnia(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; --i)
        	s1 += s.charAt(i);
        return s1;
    }
    
    public static Boolean perevirka(String s) {
        if(s.equals(zvorotnia(s))) {
            System.out.println("Строка \"" + s + "\" - є паліндромом");
        }else {
            System.out.println("Строка \"" + s + "\" - не є паліндромом");
        }
        return s.equals(zvorotnia(s));
     } 
}