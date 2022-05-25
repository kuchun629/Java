package tutorials.basic; //package decoration

public class AccessModifiers {

	////order by restrictiveness
	//private - class
	//default - package
	//protected - package, subclasses
	//public - anywhere
	
	int x;
	protected int y;
	//both of these variables are visible to our tutorial.basic package
	
	public static void main(String[] args) {
		
	}
	
	//public visibility means that this method can be accessed anywhere in the program so
	//long as you have an instance of this class to call it from
	public void doSomethingPublic() {
		
	}
	
	//private visibility means that this method can't be accessed anywhere other than inside of this class
	private void doSomethingPrivate() {
		
	}
	
	//protected visibility means that this method can only be accessed inside of this package
	//and from the subclass of this class
	protected void doSomethingProtected() {
		
	}
	
	//default visibility mean that this method can only be accessed inside of this package
	void defaultDoSomething() {
		
	}
}
