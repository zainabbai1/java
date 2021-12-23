package ArrayList_practice;

import java.util.ArrayList;

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList();
		colors.add("purple");
		colors.add("Blue");
		colors.add("green");
		colors.add("pink");
		colors.add("yellow");
		ArrayList<String> colors2 = new ArrayList(colors);
		System.out.println(colors2);
	}

}
