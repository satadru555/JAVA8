package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DobleColonSet {

	public static void main(String [] args) {
	List<Employee> emplist = new ArrayList<>();
	
	emplist.add(new Employee("satadru","sata@gmail.com",100000.00));
	emplist.add(new Employee("santanu","sant@gmail.com",200000.00));
	emplist.add(new Employee("pramit","pra@gmail.com",300000.00));
	emplist.add(new Employee("sarbo","sar@gmail.com",100000.00));
	
	System.out.println("Before sorting-----------");
	emplist.forEach(System.out::println);
	
	//Collections.sort(emplist, new EmployeeListSorter());
	Collections.sort(emplist, (e1,e2)->e1.getName().compareTo(e2.getName()));

	System.out.println("After sorting------------");
	
	emplist.forEach(System.out::println);
	
	
	
	}	
}
