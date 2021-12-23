package List;

import java.util.Objects;

public class students  implements Comparable<students>
{
   String Name;
   int roll_no;
    
   public students(String Name,int roll_no) 
   {
	   this.Name = Name;
	   this.roll_no = roll_no;
   }

@Override
public String toString() {
	return "students [Name=" + Name + ", roll_no=" + roll_no + "]";

}

@Override
public int compareTo(students that)
{
	return this.roll_no - that.roll_no;
	
}}



  

