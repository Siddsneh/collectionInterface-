package ListCollectionDemo;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("cucumber");
		arr.add("BDD");
		arr.add("jenkins");
		arr.add("GitHub");
		arr.add("API");
		arr.add("DataBase");
		arr.add("HTML code");
		arr.add("Java Script");
		arr.add("Cypress");
		
		System.out.println(arr);
		//arr.remove("Java Script");
	arr.remove(0);
	System.out.println(arr);
	
	System.out.println(arr.contains("cucumber"));
		
		
	}

}
