package JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ReferenceToInstanceMethod {

	public static void main (String[] args) {
		
		List<Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee("satadru","sata@gmail.com",100000.00));
		emplist.add(new Employee("santanu","sant@gmail.com",200000.00));
		emplist.add(new Employee("pramit","pra@gmail.com",300000.00));
		emplist.add(new Employee("sarbo","sar@gmail.com",100000.00));
		
		List<String> employee = ReferenceToInstanceMethod.getName(emplist, Employee::getName);
		
		employee.forEach(System.out::println);
	}
	
	 
	private static List<String> getName(List<Employee> employee,Function<Employee,String> f ){
		
		List<String> result = new ArrayList<>();
		
		employee.forEach(n->result.add(f.apply(n)));
		
		return result;
		
	}
}
