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
		public static String[] input()
		{
			System.out.println("enter no of element");
			int size = sc.nextInt();
			System.out.println("eneter element");
			String[] array = new String[size];
			for(int i=0;i<size;i++)
			{
				array[i] = sc.next();
			}
			return array;
		}
		public static int[] inputinteger()
		{
			System.out.println("enter no of element");
			int size = sc.nextInt();
			System.out.println("eneter element");
			int[] array = new int[size];
			for(int i=0;i<size;i++)
			{
				array[i] = sc.nextInt();
			}
			return array;
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
		//check palindrome
		static void palindrome(int num1)
		{
			int number = num1;
			int sum=0;
			while(number != 0)
			{
				int rem= number%10;
				sum =sum*10+rem;
				number = number/10;
			}
			System.out.println(sum);
			if(num1 == sum)
				System.out.println("palindrome");
			else
				System.out.println("not palindrome");
		}
		//Checking prime number
		static void prime()
		{
			for(int i=0;i<1000;i++)
			{
				//call to check method for prime number
				if(isPrime(i))
				{
					System.out.println(i);
				}
			}
		}
		static boolean isPrime(int num)
		{
			
			if(num<=1)
			{
				return false;
			}
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
					return false;
			}
			return true;
		}
		
		//binray search for integer
		 public static int search(int[] array, int first, int last1, int search)
		 {
			 if(last1 >= first)                   
			 {
				 //mid of array
				  int mid = first+(last1-first)/2;
				  
				//check condition search element is equal to  mid of array
				  if(array[mid] == search)
				  {
					  //return mid 
					return mid;
				  }
				  //check condition search element is less than mid of array
				  if(array[mid] > search)
				  {
					  //call again search method 
					  return search(array,first,mid-1,search);
				  }
				  else
				  {
					  //call again search method 
					  return search(array,mid+1,last1,search);
				  }
			 }
			 return -1;
		 }
		 
		 //binary search for String
		public static int searchString(String[] array1, String search) 
		{
			int first = 0;
        	int last = array1.length - 1;
        	
        	//iterate through array
        	while(first<=last)
        	{
        		//Find middle of array
        		int mid=(first+last)/2;
        		
        		//if middle element is greater than key then middle will become last
        		if(search.compareToIgnoreCase(array1[mid])<0)
        		{
        			last = mid;
        		}
        		
        		//if middle element is less than key then middle + 1 will become first
        		else if(search.compareToIgnoreCase(array1[mid])>0)
        		{
        			first = mid + 1;
        		}
        		else
        		{
        			//if above two conditions failed, return middle
        			return mid;
        		}
        	}
        	return -1;
        	
		}
		//insertion sort for String
				public static String[] insertionSort(String[] array, int size)
				{
					for(int i=0;i<size;i++)
					{
						String s1 = array[i];
						int j = i-1;
						while((j > -1) && (array[j].compareTo(s1) > 0))
						{
							array[j+1] = array[j];
							j--;
						}
						array[j+1] = s1;
					}
					return array;
				}
				//insertion sort for Integer
				public static int[] insertionInt(int[] array, int size)
				{
					for(int i=0;i<size;i++)
					{
						int number = array[i];
						int j = i-1;
						while((j > -1) && (array[j] > number))
						{
							array[j+1] = array[j];
							j--;
						}
						array[j+1] = number;
					}
					return array;
				}
		//bubble sort for string
		public static String[] bubbleSort(String[] array, int size)
		{
			String temp;
			int size1 = array.length;
			for(int i=0;i<size1;i++)
			{
				for(int j=i+1;j<size1;j++)
				{
					if((array[i].compareTo(array[j])>0))
					{
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			return array;
		}
		//bubble sort for Integer
		public static int[] bubbleSortInt(int[] array, int size)
		{
			int temp;
			int size1 = array.length;
			for(int i=0;i<size1;i++)
			{
					for(int j=i+1;j<size1;j++)
					{
						if(array[i] > array[j])
						{
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
			}
			return array;
		}
		public static int claculateNotes(int money, int[] notes,int total, int i)
		{
			int rem=0;
			//if money is zero then return total number of notes
			if(money == 0)
			{
				return total;
			}
			else
			{
				if(money >= notes[i])
				{
					//calculate notes of same amount
					int calNotes = money/notes[i];
					//Remaining amount
					rem = money%notes[i];
					money = rem;
					//total number of notes
					total += calNotes;
					System.out.println(notes[i]+" Rs.Notes-> "+calNotes);
				}	
			}
			i++;
			return claculateNotes(money,notes, total, i);
		}
		
}
