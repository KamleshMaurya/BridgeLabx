/*
 * Binary Search the Word from Word List
Desc -> Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
I/P -> read in the list words comma separated from a File and then enter the word to be searched
Logic -> Use Arrays to sort the word list and then do the binary search
O/P -> Print the result if the word is found or not

 */
package Algorith;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class FileBinarySearch 
{
	public static void main(String[] args) throws Exception {
		File f1 = new File("file.txt");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		String s2 ="";
		while(s1 != null)
		{
			System.out.println(s1+"");
			s2 = s2+s1;
			s1 = bin.readLine();
		} 
		System.out.println("After sorting the element--------");
		String[] array = s2.split(",");
		//call bubbleSort() for sorting element
		Util.bubbleSort(array, array.length);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		String search = Util.inputString();
		//call binarySearch for search element
		int result = Util.searchString(array, search);
		if(result == -1)
			System.out.println("not found");
		else
			System.out.println(search +" found at index: "+result);
	}

}
