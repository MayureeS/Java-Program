package useModel;

import java.util.TreeSet;

import model.Person;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Person>actors = new TreeSet<Person>();
		actors.add(new Person("SaifAli" , "Khan")) ;
		actors.add(new Person("Shaharukh" , "Khan")) ;
		actors.add(new Person("Salman" , "Khan")) ;
		actors.add(new Person("Amir" , "Khan")) ;
		for(Person p : actors)
		{
			System.out.println(p.toString());
		}
	}

}
