/*
 The stack is a linear data structure that is used to store the collection of objects. 
 It is based on Last-In-First-Out (LIFO). Java collection
 */

package stack;

import java.util.Stack;

public class stack_push 
{
  public static void main(String[] args) 
  {
     Stack <String> animals = new Stack<>();
	
     animals.push("lion");
     animals.push("tiger");
     animals.push("cat");
     animals.push("cow");
     animals.push("rainosaraous");
     
     System.out.println(animals+"\n");
     
     //peek element
     System.out.println("peek element before pop: "+animals.peek());
     
     //pop element
     animals.pop();
     System.out.println("peek element after pop: "+animals.peek());
     
     //check the stack is empty or not
     boolean result = animals.empty();
     System.out.println("is the stack empty?: "+result);
     
     //Search an element
     int location = animals.search("cat");
     System.out.println("Search the position of cat in stack: "+location);
     
     //Size of the stack
     int x=animals.size();  
     System.out.println("The stack size is: "+x);  
  }

}
