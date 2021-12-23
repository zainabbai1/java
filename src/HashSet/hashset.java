/*
 * HashSet stores the elements by using a mechanism called hashing.
    HashSet contains unique elements only.
    HashSet allows null value.
    HashSet class is non synchronized.
    HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
    HashSet is the best approach for search operations.
    The initial default capacity of HashSet is 16, and the load factor is 0.75.
    
    list can contain duplicate elements whereas Set contains unique elements only.
 */
/*
 * add();
 * clear();
 * clone();
 * isEmpty();
 * iterator();
 * remove();
 * size();
 * spliterator()
 */
package HashSet;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<>();
		
		set.add(45);
		set.add(78);
		set.add(78);
		set.add(65);
		set.add(89);
	    set.add(12);
	    
   System.out.println(set); //it print random order repitation not allowed 

   System.out.println("size: "+set.size()+"\n");
   System.out.println("remove: "+set.remove(65)+"\n");
   System.out.println("contains: "+set.contains(45)+"\n");
   System.out.println("is empty?: "+set.isEmpty()+"\n");
   set.clear();
   System.out.println(set);
	}

}
