package SetCollectionDemo;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("selenium");
		hs.add("selenium");
		hs.add(100);
		hs.add(100);
		hs.add(null);
		hs.add(true);
		
		System.out.println(hs);
		
		hs.remove(100);
		System.out.println(hs);
		
		hs.remove("selenium");
		System.out.println(hs);
		
		hs.add("GitHub");
		System.out.println(hs);
		
		for(Object o:hs) {
			System.out.println();
		}
		

	}

}
