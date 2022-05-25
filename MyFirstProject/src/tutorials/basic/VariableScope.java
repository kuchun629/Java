package tutorials.basic;

public class VariableScope {
	
	//because x is declared outside of any method, it is in scope to all methods
	//any method can access x
	static int x;
	
	public static void main(String[] args) {
		x = 5; //assigning a value to x
		System.out.println(x);
		
		doSomething();
		System.out.println(x);
		
		doSomethingLocally();
	}
	
	static void doSomething() {
		x = 10; //assigning a value to x
	}
	
	static void doSomethingLocally() {
		//because y is declared inside of this method, it is local to this method,
		//in other word, no other method has access to y
		int y = 100; //declaring and initialising the variable y
		System.out.println(y);
	}
}
