package SetCollectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo1 {

	public static void main(String[] args) {

		LinkedHashSet hs1=new LinkedHashSet();
				
		hs1.add("siddhesh");
		hs1.add("siddhesh");
		hs1.add(null);
		hs1.add(100);
		hs1.add(100);
		hs1.add(true);
		
		LinkedHashSet hs2=new LinkedHashSet();
		hs2.add("snehal");
		hs2.add(100);
		hs2.add(true);
		hs2.add(null);
		
		System.out.println(hs1);
		
		hs1.addAll(hs2);
		 System.out.println(hs1);
		 
		 hs1.retainAll(hs2);
		 System.out.println(hs1);
		
		hs1.removeAll(hs2);
		System.out.println(hs1);

	}

}
