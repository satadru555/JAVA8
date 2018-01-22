package JAVA8;

public class OperationImpl {

	
	public static void main(String [] args) {
		
		int x=20;
		int y=30;
		
		operate(x,new Operation() {
			
			public void operate(int n) {
				
				System.out.println(n+y);
			}
		} );
		
		
//operate(x,n->System.out.println(n) );
		
	}
	
	private static void operate(int i,Operation o) {
		
		o.operate(i);
		
	}
}
