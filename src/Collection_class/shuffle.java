package Collection_class;

import java.util.ArrayList;
import java.util.Collections;

public class shuffle {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList();
		colors.add("purple");
		colors.add("Blue");
		colors.add("green");
		colors.add("pink");
		colors.add("yellow");
		
		System.out.println("original String:"+colors);
		Collections.shuffle(colors);
		System.out.println(colors);
	}

}
