/*
 * An Anagram Detection Example
Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
O/P -> The Two Strings are Anagram or not....

 */
package Algorith;
public class Anagram 
{
	public static void main(String[] args) {
		Util util = new Util();
		String s1 = util.inputString();
		String s2 = util.inputString();
		util.checkAnagram(s1,s2);
	}

}
