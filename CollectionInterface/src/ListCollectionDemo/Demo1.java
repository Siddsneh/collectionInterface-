package ListCollectionDemo;

import java.util.ArrayList;


public class Demo1 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("Selenium");
		arr.add(true);
		arr.add(1000);
		arr.add(1323.5f);
		arr.add(null);
		arr.add("cucumber");
		 System.out.println(arr.get(0));
		System.out.println(arr.get(1));
   System.out.println(arr);
   
 //  for(Object o:arr) {
	   
//	   System.out.println(o);
  // }
   
   for(int i=0;i<arr.size();i++) {
	   System.out.println(arr.get(i));
	   
	   
   }
	}

}
