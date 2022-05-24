
public class Conditionals {
	public static void main(String[] args) {
		
		boolean sayHello = true;
		boolean sayHey = false;
		boolean sayGoodbye = false;
		
		//if (some expression that evaluate to true
		//do something
		
		if (true) {
			System.out.println("Hello");
		}
		
		if (false) {
			System.out.println("Hello");
		}
		
		if (sayHello) {
			System.out.println("Hello");
		}
		
		if (sayGoodbye) {
			System.out.println("Goodbye");
		}
		
		System.out.println("Goodbye");
		
		// if - else if - else statement
		// >, <, >=, <=, !=, ==
		if (sayHello) {
			System.out.println("Hello"); 
		} else if (sayHey){
			System.out.println("Hey");
		} else {
			System.out.println("Goodbye");
		}
		
		// && AND, || OR
		if(true && true) {
			System.out.println("AND executed");
		}
		
		if(true || false) {
			System.out.println("OR executed");
		}

		//won't be executed
		if(true && false) {
			System.out.println("AND executed");
		}
		
		if(false || false) {
			System.out.println("OR executed");
		}
		
		if(true || true) {
			System.out.println("OR executed");
		}
		
		
		int playerX = 50;
		// if our player passes the left side of the screen, or right side of the screen
		if(playerX < 0 || playerX > 800) {
			//some code that reverse our player's direction
			System.out.println("OR executed");
		}
		
	}
}