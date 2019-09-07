import java.util.Scanner;

/*
 * Factors
Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.

 */
public class PrimeFactor 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		//take new variable to store value by calling prime method
		int find = prime(num);
		System.out.println(find);
	}
	static int prime(int num)
	{
		//traverse num number of times
		for(int i=2;i*i<=num;i++)
		{
			//check number is divide by i
			while(num%i==0)
			{
				System.out.print(i+",");
				num = num/i;
			}
		}
		return num;//return prime factor
	}

}
