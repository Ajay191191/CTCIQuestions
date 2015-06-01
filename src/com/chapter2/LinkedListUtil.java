package com.chapter2;

import java.util.stream.StreamSupport;

/**
 * @author ajay
 *
 */
public class LinkedListUtil {
	
	public static LLNode createLL(int numberOfNodes){
		LLNode start = new LLNode(1);
		LLNode node = start;
		for (int i = 0; i < numberOfNodes; i++) {
			node.setNext(new LLNode((int)(Math.random()*100)));
			node = node.getNext();
		}
		return start;
	}
	
	public static LLNode createLLwithDuplicates(){
		LLNode start = new LLNode(1);
		LLNode node = start;
		node.setNext(new LLNode(7)); node = node.getNext();
		node.setNext(new LLNode(6)); node = node.getNext();
		node.setNext(new LLNode(6)); node = node.getNext();
		node.setNext(new LLNode(2)); node = node.getNext();
		node.setNext(new LLNode(6)); node = node.getNext();
		return start;
	}
	
	public static void deleteNextNode(LLNode node){
		if(node!=null && node.getNext()!=null){
			node.setNext(node.getNext().getNext());
		}
	}
	
	public static void printLinkedList(LLNode start){
		Iterable<LLNode> it = () -> start.getIterator();
		StreamSupport.stream(it.spliterator(), false).forEach(System.out::print);
	}
}
