package ArrayList_practice;

import java.util.ArrayList;

public class update_set {

	public static void main(String[] args) 
	{
		ArrayList<String> colors = new ArrayList();
		colors.add("purple");
		colors.add("Blue");
		colors.add("green");
		colors.add("pink");
		colors.add("yellow");
		System.out.println("original String:"+colors+"\n");
		
		colors.set(0, "brown");
		System.out.println(colors);

	}

}
