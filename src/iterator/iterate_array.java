package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iterate_array {

	public static void main(String[] args) 
	{
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    //iterate element using for_loop
	    for(int i=0;i<cars.size();i++)
	    {
	    	System.out.println(cars.get(i));
	    }
	    System.out.println("\n");
	    
	    //iterate element using for_each loop
	    for (String i : cars)
	    {
	      System.out.println(i);
	    }
	    System.out.println("\n");
	    
	    //iterate element using iterator
	    Iterator <String> it = cars.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	}

}
