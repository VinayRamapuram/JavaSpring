package project;
import java.util.*;

public class CollectionsQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
//		Collection<Integer> q = new PriorityQueue<>();
		
//		queue.add("Uttam");
//		queue.add("Bhagya");
//		queue.add("Vinay");
//		queue.add("Suhas");
		
		for(int i=10; i>0;i--) {
			queue.add(i);
		}
	
		System.out.println(queue);
		System.out.println(queue.peek());
		
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());

	}

}
