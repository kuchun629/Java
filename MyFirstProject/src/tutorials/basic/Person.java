package tutorials.basic;

public class Person {
	String name; //instance variable
	int age;
	
	//static age;
	
	//"age" becomes a member of the class, instead of an instance of the class
	//"age" becomes a class itself, like the class "Person" comes with the class "age"
	//every person's age will be fixed
	//"static" means immutable, not changeable
	
	//java provides a default constructor, but we can create on our own
	public Person(String name) {
		this.name = name; //this is a key words for referring an object in the class
						//this.name - instance variable name ; name - String name
		System.out.println("Person created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(Person person) {
		System.out.println(getName() + " say hello to " + person.getName());
		//getName() from the object
		//person.getName() from Person person
	}
}
