package ua.sergey.kostyniuk;

public class Chas {
	 private static Long time;
	 
	 public static long getTime() {
	        if (time == null) {
	            return System.currentTimeMillis();
	        } else {
	            return time;
	        }
	 }
	 public static void setTime(long time) {
	            Chas.time = time;
	        }     
	 public static void clearTime() {
	        Chas.time = null;
	    }       

}