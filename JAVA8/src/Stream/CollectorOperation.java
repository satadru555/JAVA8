package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorOperation {

	public static void main(String[]args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("satadru");
		list.add("santanu");
		list.add("sarbo");
		
		List<String> collect = list.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
	}
}
