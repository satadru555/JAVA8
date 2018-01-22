package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import JAVA8.Employee;

public class ParallelStream {

	
	public static void main(String []args) {
		
		List<Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee("satadru","sata@gmail.com",100000.00));
		emplist.add(new Employee("santanu","sant@gmail.com",200000.00));
		emplist.add(new Employee("pramit","pra@gmail.com",300000.00));
		emplist.add(new Employee("sarbo","sar@gmail.com",100000.00));
		
		Stream<Employee> s = emplist.parallelStream(); 
	
		s.forEach(n->System.out.println(n));
     		
	}
}

