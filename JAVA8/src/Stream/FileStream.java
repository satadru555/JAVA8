package Stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {

	
	public static void main(String [] args) {
		
		Path path = Paths.get("D:/config.properties");
		
		try(Stream<String> lines = Files.lines(path)) {
		 
			lines.forEach(System.out::println);
	   		
		}catch(Exception e) {System.out.println("Exception "+e.getMessage());}
	}
}
