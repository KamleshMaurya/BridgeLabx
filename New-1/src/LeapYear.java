import java.util.Scanner;

/*
 * Leap Year
I/P -> Year, ensure it is a 4 digit number.
Logic -> Determine if it is a Leap Year.
O/P -> Print the year is a Leap Year or not.

 */
public class LeapYear 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year = sc.nextInt();
		//calling checkYear() to checking leap year
		boolean result = checkYear(year);
		if(result)
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" not leap year");
	}
	static boolean checkYear(int year)
	{
		//check condition year is 4 digit 
		if(year > 1000)
		{
			//check condition for leap year 
			if(year%4 == 0 || year%400==0 && year%100!=0)
				return true;
		}
		return false;
	}

}
