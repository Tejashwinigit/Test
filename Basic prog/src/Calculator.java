

import java.io.*;

public class Calculator {
public static BufferedReader q=new BufferedReader (new InputStreamReader (System.in));
public static void main (String []args)throws IOException{

System.out.print("Enter 1st number: ");
String num1=q.readLine();
int n1=Integer.parseInt(num1);

System.out.print("Enter operation: ");
String op=q.readLine();
char o=op.charAt(0);

System.out.print("Enter 2nd number: ");
String num2=q.readLine();
int n2=Integer.parseInt(num2);

if (n2==0 && o=='/')
{
System.out.println("Error");
}

else if(o == '+')
{
int sum=0;
sum=n1+n2;

System.out.println("The sum is " +sum);
}
else if(o == '-')
{
int diff=0;
diff=n1-n2;

System.out.println("The difference is " +diff);
}
else if(o == '*')
{
int prod=0;
prod=n1*n2;

System.out.println("The product is " +prod);
}
else if(o == '/')
{
double quo=0;
quo=n1/n2;

System.out.println("The quotient is " +quo);
}
else
{

System.out.println("Invalid");
}

}
}