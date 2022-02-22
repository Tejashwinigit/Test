package exceptionhandling;

public class Prog5 {

	public Prog5() {
		// TODO Auto-generated constructor stub
	}

}
import java.util.*;

class WeightLimitExceeds extends Prog5{
    WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}


class Main {
    void validWeight(int weight) {
        if(weight>15)
            throw new WeightLimitExceeds(weight);
        else
            System.out.println("You are ready to fly!");
    }
    
      public static void main (String[] args) {
        Main ob=new Main();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<2;i++){
            try{
                ob.validWeight(in.nextInt());
            }catch(Prog5 e){
                System.out.println(e);
            }
        }
        
	}
}
