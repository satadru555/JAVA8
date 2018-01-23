package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class FlatMap {

	public static void main(String []args) {
		
		List<Detail> details = new ArrayList<>();
		
		List<String> parts1 = new ArrayList<>();
		parts1.add("part_1_1");
		parts1.add("part_1_2");
		parts1.add("part_1_3");
		
		List<String> parts2 = new ArrayList<>();
		parts2.add("part_2_1");
		parts2.add("part_2_2");
		parts2.add("part_2_3");
		
		Detail detail1 = new Detail(100,parts1);
		Detail detail2 = new Detail(101,parts2);
		
		details.add(detail1);
		details.add(detail2);
		
		Stream<String> flatmap = details.stream().flatMap(detail->detail.getParts().stream());
		
		flatmap.forEach(System.out::println);
	}
	
}
		