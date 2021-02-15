package useModel;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {

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
		
		System.out.println("Linked List 1 :\n");
		for(String d:myList)
		{
			System.out.println(d);
		}
		Queue<String> wordQueue = new LinkedList<String>() ;
		
		for(String d : myList)
		{
			wordQueue.add(d);
		}
		
		System.out.println("\nQueue contents are :\n"+wordQueue);
		
		List<String> newList = new LinkedList<String>();
		while(wordQueue.isEmpty()== false)
		{
			newList.add(wordQueue.remove());
		}
		System.out.println("\nLinked List2 : \n"+newList);
		

	}

}
