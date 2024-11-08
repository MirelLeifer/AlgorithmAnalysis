package stacks;

import linkedLists.LinkedListII;


public class Stack<T extends Comparable<T>> {
   private LinkedListII<T>values;
   //This is the best way to implement the stack because for these 4 methods we are only dealing with the tail of the list.
   //We need a reference to the tail in order to easily add and remove and return the end of the list, but we don't need our nodes to point forward and back, since none of these methods deal with the middle of the list. 
   
   public Stack() {
	   values = new LinkedListII<T>();
	}
   
   public void push(T data) {
	   values.addLast(data);
   }
   
   public T top() {
	   return values.getLast();
   }
   
   public void pop() {
	   values.removeLast();
   }
   
   public boolean isEmpty() {
	   return (values.size() ==0);
   }
}
