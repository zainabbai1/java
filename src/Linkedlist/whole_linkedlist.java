/*
 * Java LinkedList class can contain duplicate elements.
   Java LinkedList class maintains insertion order.
   Java LinkedList class is non synchronized.
   In Java LinkedList class, manipulation is fast because no shifting needs to occur.
   Java LinkedList class can be used as a list, stack or queue.
 * LinkedList is able to access both list and queue
 * list contain array,stack,vector,linkedList
 */
/*
 * add()
 * add(index,element)
 * addAll();
 * addAll(index,element);
 * addFirst();
 * addLast();
 * clear();
 * clone();
 * contains();
 * descendingIterator();
 * get(index);
 * getFirst();
 * getLast();
 * offer();
 * offerFirst();
 * offerLast();
 * peek()
 * peekFirst();
 * peekLast();
 * poll();
 * pollFirst();
 * pollLast();
 * pop();
 * push();
 * remove();
 * remove(index);
 * removeFirst();
 * set();
 * size();
 */
package Linkedlist;
import java.util.*; 
public class whole_linkedlist
{
   public static void main(String[] args)
	{
       LinkedList<String> ll=new LinkedList<String>();  
	      
	      ll.add("Ravi");  
	      ll.add("Vijay");  
	      ll.add("Ajay"); 
	      
	      System.out.println("before adding element: "+"\n"+ll+"\n");
	      
	      ll.add("apple");
	      System.out.println("afteer adding element: "+"\n"+ll+"\n");
	      
	    //Adding an element at the specific position  
	      ll.add(0,"silver");
	      System.out.println("After adding element in 0 index: "+"\n"+ll+"\n");
	      
	      LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("Sonoo");  
          ll2.add("Hanumat");  
          
          //Adding second list elements to the first list  
          ll.addAll(ll2);  
          System.out.println("after adding all the 2nd list element to the first list: "+"\n"+ll+"\n");
          
        //Removing all the new elements from arraylist  
          ll.removeAll(ll2);  
          System.out.println("After invoking removeAll() method: "+"\n"+ll+"\n");   
          
          LinkedList<String> ll3=new LinkedList<String>();  
          ll3.add("John");  
          ll3.add("Rahul");  
         
          //Adding second list elements to the first list at specific position  
          ll.addAll(1, ll3);  
          System.out.println("after adding list 3 in particular index in list 1: "+"\n"+ll+"\n");
	      
          //element add in first and last
          ll.addFirst("first");
          ll.addLast("Last");
          System.out.println("after adding element in first and last position: "+"\n"+ll+"\n"); 
          
          //clone return a shallow copy of an ArrayList.
          System.out.println("After cloning:"+"\n"+ ll.clone()+"\n");
          
          //contains
          System.out.println("contains:"+"\n"+ll.contains("apple")+"\n");

          //Traversing the list of elements in reverse order  
          Iterator i=ll.descendingIterator(); 
          System.out.print("after traverse the list in descending order: "+"\n"); 
          while(i.hasNext())  
          {  
              System.out.print(i.next()+" ");  
          }
          System.out.println("\n");
          
          //return the element at the specified position in a list.
          System.out.println("element present in 3 index: "+"\n"+ll.get(3)+"\n");
	
          //return the first and last element in a list.
          System.out.println("first: "+ll.getFirst());
          System.out.println("second: "+ll.getLast()+"\n");
          
          //push pop in stack
          System.out.println("push add the element in stack and pop remove element in stack:");
          ll.push("head");
          System.out.println("pop: "+ll.pop()+"\n");
          
          //peek is used to checking top element
          System.out.println("the peek of element in stack: ");
          System.out.println(ll.peek()); // in stack 
          System.out.println(ll.peekFirst()); // in stack
          System.out.println("lastpeek: "+ll.peekLast()+"\n"); // in stack
          
          //queue
          
          //offer is a type of adding in queue
          ll.offer("ooty");
          ll.offerFirst("zoo");
          ll.offerLast("jungle");
          System.out.println("after adding the offer elements:"+"\n"+ll+"\n");
          
          //peek is used to checking top element
          System.out.println("the peek of element in queue: ");
          System.out.println(ll.peek()); // in queue 
          System.out.println(ll.peekFirst()); // in queue
          System.out.println("lastpeek: "+ll.peekLast()+"\n"); // in queue
          
          //poll remove the last element of queue
          System.out.println("poll remove the element in queue: ");
          System.out.println(ll.poll()); // in stack 
          System.out.println(ll.pollFirst()); // in stack
          System.out.println("lastpoll: "+ll.pollLast()+"\n"); // in stack
          
          System.out.println("size of the list: "+ll.size()+"\n");
          
          //remove
          
        //Removing specific element from arraylist  
          ll.remove("first");  
          System.out.println("after removing specified element from the list: "+"\n"+ll+"\n");
          
        //Removing element on the basis of specific position  
          ll.remove(0);  
          System.out.println("after removing specified index from the list: "+"\n"+ll+"\n");
          
        //Removing first element from the list  
          ll.removeFirst();  
          System.out.println("After invoking removeFirst() method: "+"\n"+ll+"\n");
          
        //Removing first element from the list  
          ll.removeLast();  
          System.out.println("After invoking removeLast() method: "+"\n"+ll+"\n"); 
          
       //Removing first occurrence of element from the list  
          ll.removeFirstOccurrence("Rahul");  
          System.out.println("After invoking removeFirstOccurrence() method: "+"\n"+ll+"\n");
          
      //Removing last occurrence of element from the list  
          ll.removeLastOccurrence("apple");  
          System.out.println("After invoking removeLastOccurrence() method: "+"\n"+ll+"\n");
          
          
          //clear the list
          ll.clear();
          System.out.println(ll);
          
          
                 
          
          
          
          
	}}
