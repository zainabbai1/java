package ArrayList;

import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		ArrayList cars = new ArrayList<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add(45);
	    cars.add(65);
	    System.out.println(cars+"\n");
	    
	    //remove based on index
	    cars.remove(0);
	    System.out.println("remove a element present in the zero index: "+cars+"\n");
	    
	   // remove based on values
	    cars.remove(Integer.valueOf(65));
	    cars.remove(String.valueOf("Ford"));
	    System.out.println(cars);
	    
	}

}
