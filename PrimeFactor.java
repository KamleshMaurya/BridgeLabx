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
		check(num);
	}
	static boolean prime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j == 0)
				return false;
		}
		return true;
	}
	static void check(int num) {
		for(int i=2;i*i<=num;i++)
		{
				if(prime(i))
				{
					System.out.println(i+",");
				}
			}
		}

}
