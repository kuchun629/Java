package overriding;

public class Subclass extends Base {
	public static void main(String[] args) {
		Subclass s = new Subclass();
	}

	public Subclass() {
		sayHello(); //calling the sayHello method defined in Base
	}
	
	@Override
	public void sayHello() {
		//"super" means calling the sayHello method from our class "Base"
		super.sayHello();
	}

}
