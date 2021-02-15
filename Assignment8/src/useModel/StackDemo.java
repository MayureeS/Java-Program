package useModel;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> myList = new LinkedList<String>();
		
		myList.add("Apple");
		myList.add("Bat");
		myList.add("Cat");
		myList.add("Date");
		myList.add("Eye");
		myList.add("Fish");
		myList.add("Goat");
		myList.add("Horse");

		System.out.println("Linked List1 :\n");
		for(String d:myList)
		{
			System.out.println(d);
		}
		Stack<String> myStack = new Stack<String>() ;
		
		for(String d : myList)
		{
			myStack.push(d);
		}
		
		List<String> newList = new LinkedList<String>();
		while(myStack.empty()== false)
		{
			newList.add(myStack.pop());
		}
	
		System.out.println("\nLinked List2 : \n"+newList);
	}

}
