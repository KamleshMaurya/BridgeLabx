/*
 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 

 */
package Algorith;
public class Prime 
{
	public static void main(String[] args) {
		int num=1000;
		for(int i=2;i<num;i++)
		{
			if(num == 0 || num == 1)
				System.out.println("not prime");
			else
			{
				if(num/i==0)
				{
					System.out.println("not prime ");
				}
				else
				{
					System.out.println(i);
				}
			}
		}
	}

}
