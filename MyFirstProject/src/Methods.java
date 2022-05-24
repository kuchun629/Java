
public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloTo("Charlie");
		sayHelloTo("John");
		
		int x = returnFive();
		System.out.println(x);
		
		//f(x) = x * x
		int result = square(x);
		System.out.println(result);
	}
	
	static void sayHelloWorld() {
		System.out.println("Hello, World!");
	}
	
	static void sayHelloTo(String name) { 
		System.out.println("Hello, " + name);
	} 
	//"void" here implies no returns
	
	static int returnFive() { 
		return 5;
	} 
	//"int" here implies returning an int type
	
	static int square(int x) {
		return x * x;
	}
	//this method both returns a value, and takes in data
}