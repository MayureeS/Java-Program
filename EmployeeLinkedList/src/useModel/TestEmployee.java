package useModel;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.Employee;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee(1 , "Katrina");
		Employee e2 = new Employee(2 , "Karina");
		Employee e3 = new Employee(3 , "Madhuri");
		Employee e4 = new Employee(4 , "Ritik");
		Employee e5 = new Employee(5 , "Salman");
		Employee e6 = new Employee(6 , "Amir");
		Employee e7 = new Employee(7 , "Sonakshi");
		Employee e8 = new Employee(8 , "Sushmita");
		Employee e9 = new Employee(9 , "Karishma");
		List<Employee> employeeData = new LinkedList<Employee>();
		employeeData.add(e1);
		employeeData.add(e2);
		employeeData.add(e3);
		employeeData.add(e4);
		employeeData.add(e5);
		employeeData.add(e6);
		employeeData.add(e7);
		employeeData.add(e8);
		employeeData.add(e9);
		System.out.println("Data you entered is :" +employeeData.toString());
		TestEmployee.downsize(((LinkedList<Employee>)employeeData) , 1);
		System.out.println("Modified Data is :" +employeeData.toString());
		TestEmployee.downsize( ((LinkedList<Employee>)employeeData) , 5);
		System.out.println("Modified Data is :" +employeeData.toString());
		Collections.reverse(employeeData);
		System.out.println("Modified Data is :" +employeeData.toString());
	}
	public static void downsize(LinkedList<Employee> employeeData , int n) {
		employeeData.remove(n-1);
	}

}
