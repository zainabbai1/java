package ArrayList;

import java.util.ArrayList;

public class Loop_through_an_arrayList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    for(int i=0;i<cars.size();i++)
	    {
	    	System.out.println(cars.get(i));
	    }
	    System.out.println("\n");
	    
	    for (String i : cars)
	    {
	      System.out.println(i);
	      }

}}
