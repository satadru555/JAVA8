package JAVA8;

import java.util.HashMap;
import java.util.Map;

public class LamdaMap {

 
	public static void main(String [] args) {
		
		Map<Integer,Employee> m = new HashMap<>();
		m.put(100, new Employee("satadru","sata@gmail.com",100000.00));
		m.put(101, new Employee("santanu","sant@gmail.com",200000.00));
		m.put(102, new Employee("pramit","pra@gmail.com",300000.00));
		m.put(103, new Employee("sarbo","sar@gmail.com",100000.00));
		
		
		
		m.forEach((k,v)->System.out.println(k+"\t"+v));
		
	}
	
	
}
