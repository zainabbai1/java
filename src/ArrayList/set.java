package ArrayList;

import java.util.ArrayList;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    System.out.println(cars);
	    System.out.println(cars.set(0, "Opel"));
	}

}
