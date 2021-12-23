package set;

import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args)
	{
		Set<Student> studentset = new HashSet<>();
		
		studentset.add(new Student("Anuj",2));
		studentset.add(new Student("rahul",23));
		studentset.add(new Student("rat",29));
		studentset.add(new Student("priya",9));
		studentset.add(new Student("cat",2));
        
		
		System.out.println(studentset);
	}

}
