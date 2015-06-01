package com.chapter1;

public class Problem5 {
	
	public static String removeSpaces(String withSpaces){
		StringBuffer withoutSpaces = new StringBuffer();
		
		for(char c:withSpaces.toCharArray()){
			if(c == ' ')
				withoutSpaces.append("%20");
			else
				withoutSpaces.append(c);
		}
		
		return withoutSpaces.toString();
	}
	public static void main(String[] args) {
		System.out.println(Problem5.removeSpaces("This is a sentence"));
	}
}
