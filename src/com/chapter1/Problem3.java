package com.chapter1;

import java.util.stream.IntStream;

/**
 * @author Ajay
 *
 */
public class Problem3 {

	private String string;

	public Problem3(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return this.string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public String removeDuplicateCharacters() {
		if(this.string.length()==1)
			return this.string;
		boolean isPresent[] = new boolean[256];
		IntStream.range(0, 256).parallel().forEach(i->{
			isPresent[i] = false;
		});
		char[] charArray = this.string.toCharArray();
		isPresent[charArray[0]] = true;
		int lastPos = 1;
		for (int i = 1; i < charArray.length; i++) {
			if(!isPresent[charArray[i]]){
				charArray[lastPos++] = charArray[i];
				isPresent[charArray[i]] = true;
			}
		}
		charArray[lastPos++] = 0;
		return String.valueOf(charArray).split("\0")[0];
	}
	
	public static void main(String[] args) {
		Problem3 problem = new Problem3("AASADADD");
		System.out.println(problem.removeDuplicateCharacters());
	}
}