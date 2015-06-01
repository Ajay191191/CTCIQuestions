package com.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ajay
 *
 */
public class Problem1 {
	
	private String string; 
	
	
	public Problem1(String string) {
		super();
		this.string = string;
	}

	public static void main(String[] args) {
		Problem1 problem = new Problem1("AASDFD");
		long time = System.currentTimeMillis();
		System.out.println(problem.hasAllUniqueCharacters() + " " + (System.currentTimeMillis() - time));
		time = System.currentTimeMillis();
		System.out.println(problem.hasAllUniqueCharactersComputeWithoutExtraSpace()+ " " + (System.currentTimeMillis() - time));
	}
	
	public boolean hasAllUniqueCharacters(){
		
		char[] charArray = this.string.toCharArray();
		
		List<Character> secondArray = new ArrayList<Character>();
		
		for (char c : charArray) {
			if(secondArray.contains(c))
				return false;
			secondArray.add(c);
		}
		
		return true;
	}
	
	public boolean hasAllUniqueCharactersComputeWithoutExtraSpace(){
		
		char[] charArray = this.string.toCharArray();
		
		for(int i=0;i<charArray.length;i++){
			for(int j=i+1;j<charArray.length;j++){
				if(charArray[i]==charArray[j])
					return false;
			}
		}
		
		return true;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
