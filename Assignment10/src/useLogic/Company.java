package useLogic;

import java.util.TreeSet;
import logic.Employee;
import logic.EmployeeComparator;

public class Company {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Employee> company = new TreeSet<Employee>(new EmployeeComparator());
		company.add(new Employee("Managing Director"));
		company.add(new Employee("Chief Executive Officer"));
		company.add(new Employee("Manager"));
		company.add(new Employee("Chief Operator Officer"));
		company.add(new Employee("Chief Financial Officer"));
		company.add(new Employee("Chief Technology Officer"));
		company.add(new Employee("Chief Marketing Officer"));
		company.add(new Employee("vice Precident"));
		company.add(new Employee("President"));
		company.add(new Employee("Deputy General Manager"));
		
		
		for(Employee i : company)
		{
			System.out.println(i.toString());
		}

	}

}
