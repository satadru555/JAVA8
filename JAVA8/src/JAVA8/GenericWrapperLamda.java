package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericWrapperLamda {

	public static void main(String[] args) {
		
		
		List<Integer> integers = Arrays.asList(1,0,3,4,5,6);
		
		integers.forEach(WrapperLamda((i-> System.out.println(50/i))));
		
	}
	
	private static <T> Consumer<T> WrapperLamda(Consumer<T> consumer) {
		
		
		return i->{
			
			try {
				
				consumer.accept(i);
				
			}catch(Exception e) {System.out.println("Exception is "+e.getMessage());}
		};
		
		
	}
	
}
