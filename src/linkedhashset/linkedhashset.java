/*
 * Java LinkedHashSet class contains unique elements only like HashSet.
   Java LinkedHashSet class provides all optional set operation and permits null elements.
   Java LinkedHashSet class is non synchronized.
   Java LinkedHashSet class maintains insertion order.
 */
package linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {

	public static void main(String[] args) 
	{
Set<Integer> set = new LinkedHashSet<>();
		
		set.add(45);
		set.add(78);
		set.add(78);
		set.add(65);
		set.add(89); 
	    set.add(12);
	    
   System.out.println(set); //it maintain order repetation not allowed 

   System.out.println("size: "+set.size()+"\n");
   System.out.println("remove: "+set.remove(65)+"\n");
   System.out.println("contains: "+set.contains(45)+"\n");
   System.out.println("is empty?: "+set.isEmpty()+"\n");
   set.clear();
   System.out.println(set);

	}

}
