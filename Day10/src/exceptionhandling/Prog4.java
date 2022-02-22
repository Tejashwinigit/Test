package exceptionhandling;


	import java.util.*;

	public class Prog4{
		static void func(int a,int b){
			   System.out.println(10/a); 
			  
				  int[] arr={1,2,3};
			  
			   System.out.println(arr[b]);
		}
			  
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("abcd:");
			for(int i=0;i<3;i++){
			try{
			    func(input.nextInt(),input.nextInt());
	    		}catch(ArithmeticException e){
	    		   System.out.println("can't divide by zero");
	    		}catch(ArrayIndexOutOfBoundsException e){
	    		   System.out.println("Out of bounds!");
	    		}
			     }
			
		}
	   }


	