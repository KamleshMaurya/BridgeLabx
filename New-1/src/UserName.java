/*
 * User Input and Replace String Template “Hello <<UserName>>, How are you?” 
I/P -> Take User Name as Input. Ensure UserName has min 3 char
Logic -> Replace <<UserName>> with the proper name
O/P -> Print the String with User Name 

 */
import java.util.Arrays;
import java.util.Scanner;
public class UserName 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = "Hello <<UserName>> How are you?";
		System.out.println(s1);
		//input name to replace with userName
		System.out.println("emter useNname to replace ");
		String s2 = sc.nextLine();
		//check userName length should be >=3
		if(s2.length() <=3)
		{
			System.out.println("plse enter name at least 4 charcter");
			System.exit(0);
		}
		//split String s1 by space 
		String[] s3 = s1.split(" ");
		//take another string and replace userName at index number 1
		String s4 = s1.replace(s3[1], s2);
		//print final String with replace userName
		System.out.println(s4);
	}

}
