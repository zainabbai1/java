package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashmap 
{
  public static void main(String[] args) 
  {
	  Map<String, Integer> map = new HashMap<>();  
	  map.put("One",1);  
	  map.put("Two",35);  
	  map.put("Three",3);  
	  map.put("four",4);
	  map.put("five",5);
	  
	  //key_value should be unique it won't take element it only upgrade values
	  map.put("Three", 35); 
	  
	  // check contains key
//	  if(!map.containsKey("Two"))
//	  {
//		  map.put("Two",12 );
//	  }
	  
	  //check contains value
	  System.out.println("contains: "+map.containsValue(35)+"\n");
	  
	  map.putIfAbsent("Two", 12);
	  System.out.println(map+"\n");
	 
	 //iteration
	 for(Map.Entry<String,Integer> s:map.entrySet())
	 {
		 System.out.println(s);
		 System.out.println(s.getKey());
		 System.out.println(s.getValue());
	 }
	 System.out.println("\n"); 
	 
//iterate only key
	for(String key: map.keySet())
	{
		System.out.print(key+" ");
	}
	System.out.println("\n");
	
	//iterate only value
	for(Integer value: map.values())
	{
		System.out.print(value+" ");
	}
	System.out.println("\n");
	
	//check isEmpty
	System.out.println("check empty: "+map.isEmpty()+"\n");
	
	//check size
	System.out.println("check size: "+map.size()+"\n");
	
	//remove
	map.remove("One"); //remove(key)
	System.out.println(map+"\n");
	
	//copy
	 Map<String, Integer> map1 = new HashMap<>(map);  
	 System.out.println("printing map1: "+map1);
	
	//clear
	map.clear();
	System.out.println(map);
	}

}
