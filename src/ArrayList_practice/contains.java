package ArrayList_practice;

import java.util.ArrayList;

public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList();
		colors.add("purple");
		colors.add("Blue");
		colors.add("green");
		colors.add("pink");
		colors.add("yellow");
		System.out.println(colors);
		System.out.println(colors.contains("Red"));
		System.out.println(colors.contains("pink"));
	}

}
