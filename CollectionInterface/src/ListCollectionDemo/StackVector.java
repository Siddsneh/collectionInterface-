package ListCollectionDemo;

import java.util.Stack;

public class StackVector {

	public static void main(String[] args) {
		
		Stack v=new Stack();
		v.push("A");
		v.push("B");
		v.push("c");
		v.push("D");
		
		
		System.out.println(v);
		
		System.out.println(v.pop());//remove top element
		
		
		System.out.println(v);
		System.out.println(v.peek());//get the top element
		
		System.out.println(v);
		
		
		

	}

}
