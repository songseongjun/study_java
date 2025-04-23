package Lesson13;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StackEx {
public static void main(String[] args) {
	StackEx<String>stack =new StackEx<String>();
	stack.push("A");
	stack.push("B");
	stack.push("C");
	
	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	
	Queue<String>queue=new LinkedList<String>();
	queue.add("가");
	queue.add("나");
	queue.add("다");
	
	System.out.println(queue.remove());
	System.out.println(queue.remove());
	System.out.println(queue.remove());
	
	Deque<String>deque =new LinkedList<String>();
	deque.add("1");
	deque.add("2");
	deque.addFirst("2");
	System.out.println(deque);
	
	System.out.println(deque.removeLast());
	System.out.println(deque.removeLast());
	System.out.println(deque.removeLast());
}
}
