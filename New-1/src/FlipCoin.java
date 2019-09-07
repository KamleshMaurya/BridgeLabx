import java.util.Random;
import java.util.Scanner;

/*
 * Flip Coin and print percentage of Heads and Tails
	I/P -> The number of times to Flip Coin. Ensure it is positive integer.
	Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
	O/P -> Percentage of Head vs Tails

 */
public class FlipCoin 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//take input how many time want to flip 
		System.out.println("enter number of times to flip coin");
		int number = sc.nextInt();
		double head = 0,tail = 0;
		//create object to random class 
		Random r = new Random();
		//iterate loop for flip coin
		for(int i=1;i<=number;i++)
		{
			//supply two number 
			double d = r.nextInt(2);
			if(d<0.5) 
				tail+=1;
			else 
				head+=1;
		}
		System.out.println("percentage of heads "+(double)head/100);
		System.out.println("percentage of tails "+(double)tail/100);
	}

}
