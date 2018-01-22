package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import JAVA8.Employee;

public class FilterStream {

	
	public static void main(String [] args) {
		
	List<TeamMember> teamlist = new ArrayList<>();
		
		teamlist.add(new TeamMember("Satadru",27));
		teamlist.add(new TeamMember("Srijan",28));
		teamlist.add(new TeamMember("Sambit",28));
		teamlist.add(new TeamMember("Sanatnu",27));
		teamlist.add(new TeamMember("Parmit",27));
		
		Stream<TeamMember>  stream = teamlist.stream().filter(s->s.getAge()==27);
		
		stream.forEach(s->System.out.println(s));
		
		System.out.println("------------------------------------------------");
		
		boolean anymatch = teamlist.stream().anyMatch(s->s.getName().equals("satadru"));
		
		System.out.println(anymatch);
	}
}
