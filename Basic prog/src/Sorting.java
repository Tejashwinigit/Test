

import java.io.*;
public class Sorting
{
public static void main(String args[]) throws IOException
{
int num;
System.out.println("Program to demonstrate bubble sort");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of elements to be entered <10");
num=Integer.parseInt(br.readLine());
System.out.println("Enter the numbers to be sorted");
int arr[]=new int[10];

for(int i=0;i< num;i++)
{
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("The number you have entered:");
for(int i=0;i< num;i++)
{
System.out.println(arr[i]);
}
for(int i=0;i< num;i++)
{
for(int j=i+1;j< num;j++)
{
if(arr[i]>arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("The sorted numbers are");
for(int i=0;i< num;i++)
{
System.out.println(arr[i]);
}

}
}
