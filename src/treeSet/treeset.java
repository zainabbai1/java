/*
 * Java TreeSet class contains unique elements only like HashSet.
   Java TreeSet class access and retrieval times are quiet fast.
   Java TreeSet class doesn't allow null element.
   Java TreeSet class is non synchronized.
   Java TreeSet class maintains ascending order.
 */
package treeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args)
	{
Set<Integer> set = new TreeSet<>();
		
		set.add(45);
		set.add(78);
		set.add(78);
		set.add(65);
		set.add(89);
	    set.add(12);
	    
   System.out.println(set); //it print ascending order repitation not allowed 

   System.out.println("size: "+set.size()+"\n");
   System.out.println("remove: "+set.remove(65)+"\n");
   System.out.println("contains: "+set.contains(45)+"\n");
   System.out.println("is empty?: "+set.isEmpty()+"\n");
   set.clear();
   System.out.println(set);
	}

}
