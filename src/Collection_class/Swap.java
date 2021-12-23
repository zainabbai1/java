package Collection_class;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList();
		colors.add("purple");
		colors.add("Blue");
		colors.add("green");
		colors.add("pink");
		colors.add("yellow");
		System.out.println(colors);
		
		Collections.swap(colors,0,2);
		System.out.println(colors);

	}

}
