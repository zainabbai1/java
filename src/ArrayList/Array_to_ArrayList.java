package ArrayList;

import java.util.ArrayList;

public class Array_to_ArrayList {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] =12;
		a[1] =23;
		a[2] =45;
		a[3] =78;
		a[4] =90;
		
		ArrayList<Integer> a1 = new ArrayList<>();
		for(int r:a)
		{
			System.out.println(r);
			a1.add(r);
		}
						
		a1.add(56);
		System.out.println(a1);

	}

}
