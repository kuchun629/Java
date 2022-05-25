package tutorials.basic;

public class TypesAndVariables {
	public static void main(String[] args) {
		int MyVariable; //declaring a variable
						//each java statement must end with ";"
		MyVariable = 5;	// initialising variables
		System.out.println(MyVariable); 
		
		MyVariable = 10; //change the value of MyVariable		
		System.out.println(MyVariable);
		
		MyVariable = MyVariable + 1; 		
		System.out.println(MyVariable);
		
		int MyVar2 = 7;		
		System.out.println(MyVariable + MyVar2);
		
		double MyVar3 = 2.5;
		System.out.println(MyVar3);
		
		String hello = "Hello, ";
		String name = "Charlie";		
		System.out.println(hello + name); //String concatenation
	}
}

// declare variables - initialise - print
