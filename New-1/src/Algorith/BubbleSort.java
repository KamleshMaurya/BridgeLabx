/*
 * Desc -> Reads in integers prints them in sorted order using Bubble Sort
I/P -> read in the list ints
O/P -> Print the Sorted List 

 */
package Algorith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort 
{
	public static void main(String[] args) {
		Util util = new Util();
		int[] array = util.inputinteger();
		//bubble sort for sorting array element
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i] > array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//System.out.println("sorted array: "+Arrays.toString(array));
		//store element into list 
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<array.length;i++)
		{
			int num = array[i];
			list.add(num);
		}
		System.out.println(list); 
	}

}
