package ArrayList;
import java .util.ArrayList;
class number<X ,Y>
{
	X x;
	Y y;
	number(X x, Y y)
	{
		this.x=x;
		this.y=y;
	}
	void get()
	{
		System.out.println(x+" "+y);
	}
}

public class ArrayList_using_Generic 
{
   public static void main(String[] args) 
   {
		number<Integer,Boolean> n1 = new number(78,true);
        n1.get();
	}

}
