package exceptionhandling;

public class prog3 {
	static void canVote(int age) {
		
		if(age<18)
			throw new ArithmeticException("not valid");
		else 
			System.out.println("can vote");
	}

	public static void main(String args[])
	{
		try {
		canVote(13);
		}
		catch(Exception ex) {
		System.out.println("rest of the code..");
	}
	}
}
	
			