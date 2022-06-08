package MapInterfaceDemo1;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		
		Hashtable<Object,Object> h=new Hashtable<Object,Object>();
		h.put(101, "siddhesh");
		h.put(102, "snehal");
		h.put(103, "shaila");
		h.put(true, "rajendra");
		h.put(104, "selenium");
		h.put(105, true);
		
		System.out.println(h);
		System.out.println(h.containsKey(true));
System.out.println(h.containsValue("siddhesh"));
	}

}
