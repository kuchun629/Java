package tutorials.basic;

public class ClassesAndObjects {
	
	//Learning Goal: Create objects from the classes we wrote (instantiate)
	
	//a blueprint for a house (only need a blueprint to create a house)
	//with a blueprint, you can create many identical houses
	//with a class, you can create many objects (in Java)
	
	//each object can have its own variable and method
	
	public static void main(String[] args) {
		
		//Person person = new Person(); //"new" calling the constructor (Person) for the class
		
		Person john = new Person("John");
		//john.name = "John";
		//john.age = 20; //bad practice, should use "getter and setter" instead
		john.setAge(20);
		
		Person bob = new Person("Bob");
		//bob.name = "Bob";
		//bob.age = 25;
		bob.setAge(25);
		
		john.sayHelloTo(bob);
		//getName()  //person.getName()
		bob.sayHelloTo(john);
		
		System.out.println(john.getName() + " is " + john.getAge() + " years old.");
		System.out.println(bob.getName() + " is " + bob.getAge() + " years old.");
	}

}
