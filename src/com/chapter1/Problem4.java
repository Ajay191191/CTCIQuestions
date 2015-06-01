package com.chapter1;

/**
 * @author Ajay
 *
 */
public class Problem4 {

	private static boolean isAnagram(String string1, String string2){
		if(string2==null || string1 == null)
			return false;
		if(string2.length()!=string1.length())
			return false;
		if(string2.equals(string1))
			return true;
		for(char c: string2.toCharArray()){
			if(!string1.toLowerCase().contains(Character.toLowerCase(c)+""))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(Problem4.isAnagram("Si siht", "This is a "));
	}
}
