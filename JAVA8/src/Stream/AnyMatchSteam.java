package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatchSteam {

	
	public static void main(String [] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("satadru");
		list.add("satanu");
		list.add("sarbojeet");
		
		Stream<String> stream = list.stream();
		
		//long Check = stream.distinct().count();
		
		//System.out.println("check is "+Checkk);
		
		
		
		
		
		boolean anymatch= stream.anyMatch(s->s.contains("satadru"));
		
		System.out.println("anymatch "+anymatch);
		
		
		
	}
}
