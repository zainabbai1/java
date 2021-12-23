package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list 
{
  public static void main(String[] args) 
  {
		List<students> list = new ArrayList<>();
		
		list.add(new students("orange", 2));
		list.add(new students("sapota", 6 ));
		list.add(new students("kiwi", 5));
		list.add(new students("cherry", 1 ));

//		 students s1 = new students("guva",5); 
//		 students s2 = new students("pine",6);
		
		 Collections.sort(list, new Comparator<students>()
		 {

			@Override
			public int compare(students o1, students o2)
			{
				return o1.Name.compareTo(o2.Name);
			}
			 
		 });
		// System.out.println((s1.compareTo(s2)));
		
		System.out.println(list);
	}

}
