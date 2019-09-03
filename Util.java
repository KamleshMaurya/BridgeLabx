package Algorith;
import java.util.Arrays;
import java.util.Scanner;

public class Util 
{
		static Scanner sc = new Scanner(System.in);
		
		public static String inputString()
		{
			System.out.println("enter String");
			String str = sc.nextLine();
			return str;
		}
		
		public static int inputInt()
		{
			System.out.println("enter Integre ");
			int num = sc.nextInt();
			return num;
		}
		//check for anagram 
		public void checkAnagram(String s1,String s2) 
		{
			//check both length same or not
			if(s1.length() == s2.length())
			{
				//convert string to array
				char[] c1 =s1.toCharArray();
				//sort array
				Arrays.sort(c1);
				char[] c2 = s2.toCharArray();
				Arrays.sort(c2);
				//store array into new String
				String s3 = new String(c1);
				String s4 = new String(c2);
				//check condition for anagram if both string equals then anagram 
				if(s3.equals(s4))
					System.out.println(s1+" and "+s2+ " both are anagram");
				else
					System.out.println(s1+" and "+s2+" both are not anagram");
			}
			else
			{
				System.out.println("length of both string should be same");
			}
			
			
		}

	

}
