/*
 * The PriorityQueue class provides the facility of using queue. 
 * But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
 */
package Queue_linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  //asscending
		//PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Comparator.reverseOrder()); //descending
		
		queue.offer(23);
		queue.offer(67);
		queue.offer(12);
		queue.offer(1);		
		queue.offer(56);
		
		System.out.println(queue);
		System.out.println("size: "+queue.size());
		
		System.out.println("poll element: "+queue.poll());
		System.out.println("after poll: "+queue);
		
		System.out.println("peek: "+queue.peek());

	}

}
