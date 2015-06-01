/**
 * 
 */
package com.chapter2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

/**
 * @author ajay
 *
 */
public class Problem1 {
	
	public static void removeDuplicatesWithTempBuffer(LLNode start){
		
		Set<Object> set = new HashSet<Object>();
		set.add(start.getData());
		
		Iterable<LLNode> it = () -> start.getIterator();
		StreamSupport.stream(it.spliterator(), false).forEach(new Consumer<LLNode>() {
			LLNode previous = start;
			@Override
			public void accept(LLNode node) {
				if(!set.contains(node.getData())){
					set.add(node.getData());
					previous =node;
				}
				else{
					previous.setNext(node.getNext());
				}
			}
		});
		
	}
	
	public static void removeDuplicatesWithoutBuffer(LLNode start){
		Iterable<LLNode> it = () -> start.getIterator();
		StreamSupport.stream(it.spliterator(), false).forEach(node-> removeDuplicateForValue(node.getData(), node));
	}
	private static void removeDuplicateForValue(Object value,LLNode start){
		Iterable<LLNode> it = () -> start.getIterator();
		StreamSupport.stream(it.spliterator(), false).forEach(new Consumer<LLNode>() {
			LLNode previous = start;
			@Override
			public void accept(LLNode node) {
				if(!value.equals(node.getData())){
					previous =node;
				}
				else{
					previous.setNext(node.getNext());
				}
			}
		});
	}
	
	public static void main(String[] args) {
		LLNode start = LinkedListUtil.createLLwithDuplicates();
		System.out.println("Before");
		LinkedListUtil.printLinkedList(start);
//		removeDuplicatesWithTempBuffer(start);
		removeDuplicatesWithoutBuffer(start);
		System.out.println("After");
		LinkedListUtil.printLinkedList(start);
	}
}
