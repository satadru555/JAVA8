package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String [] args) {
		
		String arr[] = new String [] {"AA","BB","CC"};
		
		Stream<String> stream = Arrays.stream(arr); 
		
		stream.forEach(n->System.out.println(n));
		
       System.out.println("------------------------------------------------------------");
		
		Stream stream1 = Stream.of("A","B","C","D","E");
		
		stream1.forEach(n->System.out.println(n));
	
		List<String> a = new ArrayList<String>(); 
		a.add("satadru");
		a.add("santanu");
		a.add("pramit");
        a.add("sarbojeet");
        
        Stream<String> stream3 = a.stream();
        
        System.out.println("-----------------------------------------------------------");
        
        
        
        stream3.forEach(x->System.out.println(x));
		
	}
	
}
