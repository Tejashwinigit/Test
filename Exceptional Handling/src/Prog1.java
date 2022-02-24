

import java.util.*;

public class Prog1 {
    public static void main (String[] args) {
    	int a=5;
    
       try {
       
      System.out.println(5/0);
       }
    
    catch(ArithmeticException e) {
        System.out.println("End of program!");
	}
    }



