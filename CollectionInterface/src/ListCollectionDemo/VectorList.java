package ListCollectionDemo;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add("selenium");
		v.add(100);
		v.add(true);
		v.add(null);
		v.add("selenium");
		
		
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		
		v.set(3, "html");
		System.out.println(v);
		

	}

}
