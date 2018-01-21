package JAVA8;
import java.util.ArrayList;
import java.util.List;
public class BasicLamda {

	
	public static void main(String[] args) {  
  
       List<String> namelist = new ArrayList<String>();
       namelist.add("satadru");
       namelist.add("santanu");
       namelist.add("pramit");
       
       namelist.forEach((name)->System.out.println(namelist));
       
       
       BaseLamda baseLamda = (String name,int age)->{
    	   
    	  System.out.println("name "+name);
    	  System.out.println("age "+age);
       };
       
       baseLamda.Detail("satadru", 100);
       
	}

	
}
