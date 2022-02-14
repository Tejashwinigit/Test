

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Addtwonum 
{
   public static void main(String[] args) throws NumberFormatException, IOException 
   {
      int number1, number2, add;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Please enter two numbers to add: ");
      number1 = Integer.parseInt(br.readLine());
      number2 = Integer.parseInt(br.readLine());
      add = number1 + number2;
      System.out.println("Add two numbers using bufferedreader: " + add);
   }
}
