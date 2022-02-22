package exceptionhandling;


	import java.io.*;

	public class Prog6 {
	  public static void findFile() {
try {
	

	       File newFile = new File("test.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }
	
catch(ArithmeticException e) 
{
	
}
	  public static void main(String[] args) {
	    System.out.println(“hello”);
	  }
	}


	

