import java.util.Scanner;

/*
 * Harmonic Number 
Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
I/P -> The Harmonic Value N. Ensure N != 0
Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
O/P -> Print the Nth Harmonic Value.
==sum of first reciprocal of N natural number

 */
public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int number = sc.nextInt();
		//take variable to store value
		double sum = 0;
		//check condition N != 0
		if(number !=0 )
		{
			for(int i=1;i<=number;i++)
			{
				sum += 1.0/i;
				//sum += (double)1/i;
			}
			System.out.println(sum);
		}
		else
		{
			System.out.println("enter number != 0");
		}
		
	}

}
