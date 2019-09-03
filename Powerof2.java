/*
 * Power of 2 
Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
Logic -> repeat until i equals N.
O/P -> Print the year is a Leap Year or not.

 */
public class Powerof2 
{
	public static void main(String[] args) {
		
		int num =Integer.parseInt(args[0]);
		for(int i=1;i<31;i++)
		{
			int result =(int) Math.pow(2, i);
			System.out.println(result);
		}
	}
}
