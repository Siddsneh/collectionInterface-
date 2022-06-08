package ListCollectionDemo;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList ls= new LinkedList();
		ls.add("selenium");
		ls.add("cucumber");
		ls.add(10);
		ls.add(null);
		ls.add("selenium");
		ls.add(true);
		 System.out.println(ls);
		  
		 ls.addFirst("Jenkins");
		 System.out.println(ls);
		 
		 ls.addLast("Html");
		 System.out.println(ls);
		 
		 System.out.println(ls.remove(0));
	
		 System.out.println(ls.removeFirst());
		 
		 System.out.println(ls);
		 
		 System.out.println(ls.getLast());
		 
		 System.out.println(ls.getFirst());
		 
		 System.out.println(ls.get(0));
		   
		 
		 for(Object o:ls) {
			 System.out.println(o);
		 }

		 
		 
		 
	}

}
