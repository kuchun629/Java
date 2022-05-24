
public class ReferenceAndVariableTypes {
	
	public static void main(String[] args) {
		//byte, short, int, long, float, double, boolean, char
		
		//int x = 5;
		//addOneTo(x); //passing a value type, so a copy of the value of x is passed, which is 5
		//System.out.println(x); //won't return 6
		
		Number x;
		x = new Number();
		x.setNumber(5);
		addOneTo(x); 
		System.out.println(x.getNumber());
		
		Person john;
		john = new Person("John"); //creating a new person object, and assigning john to refer to it
		john.setAge(20);
		celebrateBirthday(john); //passing the "reference"(the copy in the object) to a method, so the reference can use the reference
		System.out.println(john.getAge()); //return 6
	}
	
	private static void addOneTo(Number number) {
		number.number = number.number + 1;
		
	}

	private static void celebrateBirthday(Person person) {
		person.setAge(person.getAge() + 1);
		
	}

	
	//static void addOneTo(int number) { //manipulate a copy of the value passed
	//	number = number + 1;
	//}

}
