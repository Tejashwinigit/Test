package exceptionhandling;

import java.util.*;

public class Prog1 {
	public static void main(String[]args)
	{
		try {
			System.out.println(5/0);
		}
		catch (ArithmeticException a)
		{
		System.out.println(a);
		System.out.println("End of Program!");
		
	}
	}
	
	}

