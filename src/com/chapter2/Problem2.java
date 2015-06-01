package com.chapter2;

import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

public class Problem2 {

	public static LLNode getNthToLastNodeUsingStack(LLNode start, int n){
		
		
		final Stack<LLNode> stack = new Stack<LLNode>();
		Iterable<LLNode> iterable = ()->start.getIterator();
	    StreamSupport.stream(iterable.spliterator(),true).forEach(node->stack.push(node));
	    IntStream.range(0, n-1).parallel().forEach(i->{
	    	stack.pop();
	    });
	    
		
		return stack.pop();
	}
	
	public static LLNode nthToLastUsingLength(LLNode start, int n){

		long length = Problem2.calculateLength(start);
		long requiredIndex = length-n;
		if(requiredIndex<0)
			return null;
		
		LLNode requiredNode = start;
		for (int i = 0; i < requiredIndex && (requiredNode = requiredNode.getNext())!=null; i++);
		return requiredNode;
		
	}
	
	private static long calculateLength(LLNode start){
		Iterable<LLNode> iterable = ()->start.getIterator();
		return StreamSupport.stream(iterable.spliterator(),true).count();
	}
	
	
	public static void main(String[] args) {
		LLNode start = LinkedListUtil.createLL(10);
		System.out.println("List:");
		LinkedListUtil.printLinkedList(start);
		int n = 4;
		LLNode nthToLastNodeUsingStack = Problem2.getNthToLastNodeUsingStack(start, n);
		System.out.println();
		System.out.println("Nth " + n + " to last = " + nthToLastNodeUsingStack);
		System.out.println("nthToLastUsingLength");
		LLNode nthToLastUsingLength = Problem2.nthToLastUsingLength(start, n);
		System.out.println();
		System.out.println("Nth " + n + " to last = " + nthToLastUsingLength);
	}
}
