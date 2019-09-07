/*
 * Desc -> Reads in strings from standard input and prints them in sorted order.
Uses insertion sort.
I/P -> read in the list words
Logic -> Use Insertion Sort to sort the words in the String array
O/P -> Print the Sorted List

 */
package Algorith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class InsertionSort 
{
	public static void main(String[] args) {
		
		Util util = new Util();
		ArrayList list = new ArrayList();
		//take user input and store into array
		String[] array = util.input();
		//sort the array 
		//Util.insertionSort(array, array.length);
		for(int i=0;i<array.length;i++)
		{
			String s1 = array[i];
			int j = i-1;
			while((j > -1) && array[j].compareTo(s1) > 0)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] =s1;
		}
		System.out.println(Arrays.toString(array));
		//read array element into ArrayList
		for(int i=0;i<array.length;i++)
		{
			String s1 = array[i];
			list.add(s1);
		}
		System.out.print("Sorted List: ");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
	}

}
