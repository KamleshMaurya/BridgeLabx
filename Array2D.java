import java.util.Scanner;

/*
 * 2D Array
Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
Logic -> create 2 dimensional array in memory to read in M rows and N cols 
O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.

 */
public class Array2D 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter column of array");
		int cols = sc.nextInt();
		System.out.println("enter row of array");
		int row = sc.nextInt();
		int[][] a = Util.intvar(cols, row);
		double[][] b= Util.doublevar(cols,row);
		String[][] c = Util.stringvar(cols,row);
		System.out.println("pring integer array == ");
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("pring Double array == ");
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(b[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("pring String array == ");
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(c[i][j]+",");
			}
			System.out.println();
		}
		
		
	}
	
	
}
