package useModel;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> myTreeSet = new TreeSet<String>();
		Set<String> myHashSet = new HashSet<String>();
		
		myTreeSet.add("World");
		myTreeSet.add("Globe");
		myTreeSet.add("Epidemic");
		myTreeSet.add("Pandemic");
		myTreeSet.add("Courage");
		myTreeSet.add("Strength");
		myTreeSet.add("Values");
		myTreeSet.add("Patience");
		myTreeSet.add("Epidemic");
		myTreeSet.add("Globe");
		myTreeSet.add("Courage");
		myTreeSet.add("World");
		myTreeSet.add("Values");
		myTreeSet.add("Pandemic");
		myTreeSet.add("hygiene");
		myTreeSet.add("always");
		
		myHashSet.add("World");
		myHashSet.add("Globe");
		myHashSet.add("Epidemic");
		myHashSet.add("Pandemic");
		myHashSet.add("Courage");
		myHashSet.add("Strength");
		myHashSet.add("Values");
		myHashSet.add("Patience");
		myHashSet.add("Epidemic");
		myHashSet.add("Globe");
		myHashSet.add("Courage");
		myHashSet.add("World");
		myHashSet.add("Values");
		myHashSet.add("Pandemic");
		myHashSet.add("hygiene");
		myHashSet.add("always");
		
		System.out.println("Tree set :"+ myTreeSet+"\n");
		System.out.println("Hash set :"+ myHashSet+"\n");
		
		if(myHashSet.contains("hygiene")== true)
		{
			System.out.println("Given string is there in hashset");
		}
		else
		{
			System.out.println("Given string is not there in hashset");
		}
		
		
		if(myTreeSet.contains("hygiene")== true)
		{
			System.out.println("Given string is there in treeset");
		}
		else
		{
			System.out.println("Given string is not there in treeset");
		}
	

	}

}
