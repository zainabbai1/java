/*
 * Java ArrayList class uses a dynamic array for storing the elements. It is like an array, 
 * but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array.
 * Java ArrayList class can contain duplicate elements.
   Java ArrayList class maintains insertion order.
   Java ArrayList class is non synchronized.
   Java ArrayList allows random access because array works at the index basis.*/
/*
 * add(element);
 * add(index,element);
 * addAll(list);
 * addAl(index,list);
 * get(index);
 * clear();
 * ensureCapacity();
 * isEmpty();
 * iterator()
 * ListIterator();
 * indexOf("element");
 * clone()
 * contains("element");
 * remove(index);
 * remove("element");
 * removeRange(fromIndex,toIndex);
 * set();
 * set(index,element);
 * sort()using collection
 * replaceAll();
 * retainAll();
 * spliterator();
 * subList(fromIndex,toIndex);
 *  size();
 *  trimToSize()
 */
package ArrayList;
import java.util.ArrayList;

public class add {

	public static void main(String[] args) 
	{
    ArrayList<String> colors = new ArrayList<>();
    //size = n basically it takes 10 elements space at initial
    		//n+n/2+1
    		
    colors.add("purple");
	colors.add("Blue");
	colors.add("green");
	colors.add("pink");
	colors.add("yellow");

	System.out.println(colors+"\n");
	
	colors.add(0,"golden");
	colors.add(3,"silver");
	
	for(String shade:colors)
	System.out.print(shade+" ");

	}

}
