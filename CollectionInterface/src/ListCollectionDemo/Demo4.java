package ListCollectionDemo;

import java.util.ArrayList;

public class Demo4 {

	public static void main(String[] args) {
		ArrayList arr1=new ArrayList();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		
		System.out.println(arr1);

		arr1.set(2, null);
		System.out.println(arr1);
	}

}
