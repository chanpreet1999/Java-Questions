package com.chanpreet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueues {

	public static void main(String[] args) {
		
		System.out.println("Implement Stack and Queues");
		Stack<Integer> stack=new Stack<Integer>();
		Queue<Integer> queue=new LinkedList<Integer>();
		System.out.println("\nInserting elements to stack and queue");
		for(int i=0;i<10;i++){
			System.out.println("Adding "+i);
			stack.push(i);				//adding to stack
			queue.add(i);				//adding to queue
		}
		System.out.println("\nElements in stack are:");
		while(!stack.isEmpty()){
			System.out.print(stack.peek()+" ");
			stack.pop();
		}
		
		System.out.println("\nElements in queue are:");
		while(!queue.isEmpty()){
			System.out.print(queue.poll()+" ");
			
		}
		
		
	}

}
