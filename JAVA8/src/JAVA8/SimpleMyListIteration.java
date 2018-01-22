package JAVA8;

import java.util.ArrayList;
import java.util.List;

public class SimpleMyListIteration {

	public static void main (String [] args) {
		
		
		List<String> l = new ArrayList<String>();
		
		l.add("satadru");
		l.add("santanu");
		l.add("pramit");
		l.add("sarbojeet");
		l.add("sambit");
		
		l.forEach(x->System.out.println(x));
	}
}
