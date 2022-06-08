package ListCollectionDemo;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
	ArrayList arr1=new ArrayList();
	arr1.add(10);
	arr1.add(20);
	arr1.add(30);
	arr1.add(40);
	
	ArrayList arr2=new ArrayList();
	arr2.add(90);
	arr2.add(100);
	arr2.add(110);
	arr2.add(120);
	
	
	System.out.println(arr1);
	arr1.addAll(arr2);
	System.out.println(arr1);
	//arr1.removeAll(arr2);
	//System.out.println(arr1);
	
	arr1.retainAll(arr2);
	System.out.println(arr1);///
	

	}

}
