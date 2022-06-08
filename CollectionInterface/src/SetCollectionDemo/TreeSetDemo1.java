package SetCollectionDemo;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("siddhesh");
		t.add("snehal");
		t.add("shaila");
		t.add("rajendra");
		System.out.println(t);

		
		TreeSet t1=new TreeSet();
		t1.add(100);
		t1.add(200);
		t1.add(300);
		System.out.println(t1);
		
		TreeSet abc=(TreeSet)t.clone();
		System.out.println(abc);
		
	}

}
