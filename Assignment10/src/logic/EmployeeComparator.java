package logic;

import java.util.Comparator;

import logic.Employee;

public class EmployeeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1 , Employee e2)
	{
		return e1.getDesignation().compareTo(e2.getDesignation());
	}

}
