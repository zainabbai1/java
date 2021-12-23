package ArrayList_practice;

import java.util.ArrayList;

public class clone {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        
        //clone method
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newc1); 
        
        //normal method
        ArrayList<String> s = new ArrayList<>();
        s.addAll(c1);
        System.out.println(s);

	}

}
