package JAVA8;

import java.util.Comparator;

public class EmployeeListSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

	

}
