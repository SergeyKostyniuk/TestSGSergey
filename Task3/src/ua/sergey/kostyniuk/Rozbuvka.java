package ua.sergey.kostyniuk;

public class Rozbuvka { 
	 public static String s = " Номера з повторами | Номера з повторами | Номера з повторами | Номера з повторами | Номера з повторами | Номера з повторами | Номера з повторами |3606.|08367 3591 Номера з повторами |.08367 35|98.08367 3601.08367";
	 public  static String[] str = s.split("\\|");
	 public  static String[] mas = new String[str.length];
	
	 public static void main(String[] args){
		 
		 
		
	        for (int i = 0; i < str.length; i++) {
	            mas[i] = String.valueOf(str[i]);
	            System.out.println(mas[i]);
	        }
	
	
	 }
}
