package Stream;

import java.util.stream.Stream;

public class PipelineStream {

	public static void main(String[] args) {

     Stream<String> stream = Stream.of("satadru","santanu","parmit","sarbojet").skip(1).map(e->e.substring(0, 2));
		
     stream.forEach(System.out::println);
     
	}

}
