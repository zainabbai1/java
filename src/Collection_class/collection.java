package Collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collection 
{
  public static void main(String[] args)
	{
		List <Integer> a = new ArrayList<>();
		a.add(23);
		a.add(67);
		a.add(12);
		a.add(67);
		a.add(89);
	//min	
	System.out.println("min element: "+Collections.min(a));
	//max
	System.out.println("min element: "+Collections.max(a));
	
	//reverse
	Collections.reverse(a);
	System.out.println("After reverse element: "+a);
	
	//shuffle
	Collections.shuffle(a);
	System.out.println("After shuffle: "+a); 
	
	//swap
	Collections.swap(a,2,3);
	System.out.println("Aftert swap 2 and 3: "+a);
	
	//frequent
	System.out.println("check frequent occurance of specified element:"+Collections.frequency(a, 67));
	
	//sort
	Collections.sort(a);
	System.out.println("After sorting: "+a);
	
	//comparator
	Collections.sort(a,Comparator.reverseOrder());
	System.out.println("After sorting: "+a);
	
	
	}

}
