/*
 * Java Queue interface orders the element in FIFO(First In First Out) manner. In FIFO, first element is removed first and last element is removed at last.
   A queue can be defined as an ordered list which enables insert operations to be performed at one end called REAR 
   and delete operations to be performed at another end called FRONT.
-> asynchronous transfer of data
 */
/*
 * offer()
 * poll()
 * peek()
 * size()
 */
package Queue_linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LinledListQueue {

	public static void main(String[] args) 
	{
		Queue<Integer> queue = new LinkedList<>();
		
		/*instead of offer add method also use but if the task is successfull,add() returns true,
		   if not it throws an exception.*/
		
		queue.offer(12);
		queue.offer(67);
		queue.offer(89);
		queue.offer(23);
		queue.offer(56);
		System.out.println(queue.size());
		
		//print queue
		System.out.println(queue);
		
		//poll the element
		System.out.println("Element to be polled: "+queue.poll());
	
		/*
		 instead of using poll remove() is also use 
		 but it throws an exception if the queue is empty
		*/
		
		//After poll
		System.out.println("print queue after poll: "+queue); 
		
		/*
		 instead of using peek element() is also use 
		 but it throws an exception if the queue is empty
		*/
		
		//check peek
		System.out.println("check the peek value after poll: "+queue.peek()); 
		
		
	}

}
