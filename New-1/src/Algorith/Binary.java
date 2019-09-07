package Algorith;

import java.util.Arrays;
import java.util.Scanner;

public class Binary 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1 for Integer search \n2 for String search or \n3 for insertionSort method for integer\n4 for insertionSort method for String \n" + 
				"5 for bubbleSort method for integer\n" + 
				"6 for bubbleSort method for String\n");
		int i = sc.nextInt();
		switch(i)
		{
		case 1:
			//search for integer input
			int[] array = Util.inputinteger();
			//take user input for search
			System.out.println("enter for search");
			int search = sc.nextInt();
			int last1 = array.length-1;
			//calling search() for searching element
			int result1 = Util.search(array, 0, last1,search);
			if(result1 == -1)
				System.out.println("not found");
			else
				System.out.println("fount at index number "+result1);
			break;
		//search for String input
		case 2:
			String[] array1 =Util.input();
			//take user input for search
			System.out.println("enter string for search");
			String search1 = sc.next();
			//calling search() for searching element
			int result = Util.searchString(array1, search1);
			if(result == -1)
				System.out.println("not found");
			else
				System.out.println("fount at index number "+result);
			break;
		case 3:
			int[] array2 = Util.inputinteger();
			int[] array3 = Util.insertionInt(array2, array2.length);
			System.out.println(Arrays.toString(array3));
			break;
		case 4:
			String[] array4 = Util.input();
			String[] array5 = Util.insertionSort(array4, array4.length);
			System.out.println(Arrays.toString(array5));
			break;
		case 5:
			int[] array6 = Util.inputinteger();
			int[] array7 = Util.insertionInt(array6, array6.length);
			System.out.println(Arrays.toString(array7));
			break;
		case 6:
			String[] array8 = Util.input();
			String[] array9 = Util.insertionSort(array8, array8.length);
			System.out.println(Arrays.toString(array9));
			break;
		}
	}
}
	


