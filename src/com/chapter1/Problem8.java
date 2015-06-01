package com.chapter1;

public class Problem8 {
	public static boolean isSubstring(String rotatedString, String checkingString){
		return rotatedString.concat(rotatedString).contains(checkingString);
	}
	
	public static void main(String[] args) {
		System.out.println(Problem8.isSubstring("erbottlewat", "waterbottle"));
		System.out.println(Problem8.isSubstring("erbottlewat", "waterbottel"));
	}
}
