package ArrayList_practice;

import java.util.ArrayList;

public class equals {

	public static void main(String[] args) 
	{
		String s1 = "apple";
		   ArrayList<String> str = new ArrayList<>();
		   
		   str.add("mango");
		   str.add("Guva");
		   str.add("iceapple");
		   str.add("apple");
		    for(String st1:str)
		    {
		    	if(st1.equals(s1))
		    	{
		          System.out.println("apple is present in arraylist");
		    	}
		    }
	
		
	}

}
