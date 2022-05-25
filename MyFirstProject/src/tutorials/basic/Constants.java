package tutorials.basic;

public class Constants {

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final Person P1 = new Person("");
	public static final int NUM_ENEMIES = 5;
	
	/*
	final
	WIDTH & HEIGHT could never change value under the status "final", 
	but every time we create a constant object, there is going to be a different
	copy of WIDTH & HEIGHT
	
	static
	no matter how many objects we create, there is going to be 
	only one copy of WIDTH & HEIGHT
	
	public
	so we can use these unchangeable constants anywhere in our program
	 */
	
	public static void main(String[] args) {
		
		//constants never change once a value is assigned
		//usually static
		//by convention, constants are UPPER CASE
		
		//declare constants by using the "final" modifier
		//constants can be public because there is no harm in accessing variables directly if you can't alter it
		
		System.out.println(Math.PI);
		System.out.println(Constants.WIDTH);
		System.out.println(WIDTH); 
		//because we are inside the Constants class itself,
		//we don't need to refer with a fully-qualified class name
	}
}
