package com.chapter1;

/**
 * @author Ajay
 *
 */
public class Problem2 {
	
	private String string;
	
	public Problem2(String string) {
		super();
		this.string = string;
	}

	public static void main(String[] args) {
		Problem2 problem = new Problem2("ASD\0");
		long time = System.currentTimeMillis();
		System.out.println(problem.reverseStringUsingRecursion()+ " " + (System.currentTimeMillis() - time));
		time = System.currentTimeMillis();
		System.out.println(problem.reverseStringUsingLoop()+ " " + (System.currentTimeMillis() - time));
	}

	public String reverseStringUsingLoop(){
		char[] charArray = this.string.toCharArray();
		int position=0;
		while(charArray[position] != '\0')
			position++;
		String reverse="";
		while(position>=0)
			reverse += charArray[position--];
		return reverse.trim();
	}
	
	public String reverseStringUsingRecursion(){
		char[] charArray = this.string.toCharArray();
		return this.reverse(charArray,0);
	}
	
	private String reverse(char[] arr, int position){
		if(arr[position] == '\0')
			return "";
		return this.reverse(arr,position+1)+ "" + arr[position]; 
			
	}
	
	public String getString() {
		return this.string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
