package JAVA8;

public class MyComparatorCheck {

	public static void main(String[] args) {
	
	MyComparator myComparator = (n1,n2)->n1>n2;
	
	boolean compare= myComparator.comapare(60, 50);
	
	System.out.println("compare "+compare);
	
}

}