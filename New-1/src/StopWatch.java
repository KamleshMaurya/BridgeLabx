/*
 * Simulate Stopwatch Program
Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
I/P -> Start the Stopwatch and End the Stopwatch
Logic -> Measure the elapsed time between start and end
O/P -> Print the elapsed time.

 */
import java.util.Scanner;
public class StopWatch 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for start");
		int num = sc.nextInt();
		long start = System.currentTimeMillis();
		System.out.println(start);
		System.out.println("enter 2 for end");
		int num1 = sc.nextInt();
		long end = System.currentTimeMillis();
		System.out.println(end);
		long result = elapsed(start,end);
		System.out.println("Elapsed time in second :"+(double)result/1000);
		System.out.println("Elapsed time in millisecond "+result);
	}
	static long elapsed(long start,long end)
	{
		long elapsed = end-start;
		return elapsed;
	}

}
