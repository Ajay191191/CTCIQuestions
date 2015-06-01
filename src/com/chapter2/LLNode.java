/**
 * 
 */
package com.chapter2;

import java.util.Iterator;

/**
 * @author ajay
 *
 */
public class LLNode {
	private LLNode next;
	private Object data;
	public LLNode getNext() {
		return next;
	}
	public void setNext(LLNode next) {
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public LLNode(LLNode next, Object data) {
		super();
		this.next = next;
		this.data = data;
	}
	
	public LLNode() {
		super();
	}
	
	@Override
	public String toString() {
		return "Data " + this.data + " ";
	}
	
	public LLNode(Object data) {
		super();
		this.data = data;
	}
	
	public Iterator<LLNode> getIterator(){
		return new LLIterator(this);
	}
	
	
	private class LLIterator implements Iterator<LLNode>{

		LLNode currentNode;
		
		public LLIterator(LLNode currentNode) {
			super();
			this.currentNode = currentNode;
		}

		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public LLNode next() {
			LLNode node = currentNode;
			currentNode = currentNode.getNext();
			return node;
		}
		
	}
}
