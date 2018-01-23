package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Builder {

	
	public static void main(String [] args) {
		
		
		Stream<String> build =  Stream.<String>builder().add("A").add("b").add("C").build();
		
		build.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		Stream<String> generate =  Stream.generate(()->"satadru").limit(10);
				
		generate.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		Stream<Integer> iterate= Stream.iterate(10, i->i+2).limit(10);
		
		iterate.forEach(System.out::println);
	}
	
}
