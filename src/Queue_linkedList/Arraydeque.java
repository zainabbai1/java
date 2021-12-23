/*
 * dequeue:
 * Java De-queue Interface is a linear collection that supports element insertion and removal at both ends. 
   De-queue is an acronym for "double ended queue".
 * ArrayDequeue:
 * The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.
 * Null elements are not allowed in the ArrayDeque.
   ArrayDeque is not thread safe, in the absence of external synchronization.
   ArrayDeque has no capacity restrictions.
   ArrayDeque is faster than LinkedList and Stack.
 */
package Queue_linkedList;

import java.util.ArrayDeque;

public class Arraydeque 
{
  public static void main(String[] args) 
  {
		ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
		
		adq.offer(45);
		adq.offer(78);
		adq.offer(65);
		//insert element at first
		adq.offerFirst(89);
		//insert element at last
		adq.offerLast(12);
		
		System.out.println(adq);
		System.out.println("size: "+adq.size()+"\n");
		
		System.out.println("peek: "+adq.peek());
        System.out.println("peekFirst: "+adq.peekFirst());
        System.out.println("peekLast: "+adq.peekLast()+"\n");
        
        System.out.println("poll: "+adq.poll());
        System.out.println("After poll: "+adq+"\n");
        
        System.out.println("pollFirst: "+adq.pollFirst());
        System.out.println("After poll: "+adq+"\n");
        
        System.out.println("pollLast: "+adq.pollLast());
        System.out.println("After poll: "+adq+"\n");
        

	}

}
