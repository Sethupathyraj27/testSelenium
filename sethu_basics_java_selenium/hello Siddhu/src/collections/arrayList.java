package collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> a = new ArrayList <Integer>();
a.add(1);
a.add(100);
a.add(1);
a.add(1);
a.add(1);
System.out.println(a);
a.remove(1);
System.out.println(a);
a.set(0, 100);
System.out.println(a);
a.clear();
System.out.println(a);
	
	}
}
