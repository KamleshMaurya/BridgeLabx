/*
 * Sum of three Integer adds to ZERO
Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
I/P -> N number of integer, and N integer input array
Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.

 */
import java.util.Arrays;
import java.util.Scanner;
public class SumofZero 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		System.out.println("enter element of array");
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		for(int i=0;i<array.length-2;i++)
		{
			for(int j=i+1;j<array.length-1;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k] == 0)
					{
						System.out.println(array[i]+","+array[j]+","+array[k]);
					}
				}
			}
		}
	}

}
