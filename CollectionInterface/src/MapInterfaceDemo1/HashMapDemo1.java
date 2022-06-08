package MapInterfaceDemo1;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Object,Object>h=new HashMap();
		h.put(100, "selenium");
		h.put(100, "selenium");
		h.put("siddhesh", "snehal");
		h.put(true, "shaila");
		h.put("xyz", null);
		h.put(103, null);
		h.put(null, 103);
		
		
		System.out.println(h);
		
		h.remove(true, "shaila");
System.out.println(h);




	}

}
