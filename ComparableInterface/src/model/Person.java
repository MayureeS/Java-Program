package model;

public class Person implements Comparable<Person>{
	private String fname ;
	private String lname ;
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + "]";
	}
	
	@Override
	public int compareTo(Person p){
		String pNmae1 = fname + lname ;
		String pName2 = p.getFname() + p.getLname() ;
		return pNmae1.compareTo(pName2);
	}

}
