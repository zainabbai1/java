package ArrayList;

import java.util.ArrayList;

public class addAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	   
	    ArrayList<String> cars1 = new ArrayList<>();
	    cars1.addAll(cars);
	    System.out.println(cars1);
	}

}
