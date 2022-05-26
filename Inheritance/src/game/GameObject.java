package game;

public abstract class GameObject {
	
	//this draw() method must be implemented by any class that extends the class GameObject 
	public abstract void draw();
	
	
	public static void main(String[] args) {
		Player player = new Player();
		//GameObject player = new Player(); //creating a GameObject type variable called player
										//Polymorphism 多型
		//player.someMethod();
		//error: The method someMethod() is undefined for the type GameObject
		
		player.draw();
		
		//Menu menu = new Menu();
		GameObject menu = new Menu();
		menu.draw();
		
		GameObject[] gameobjects = new GameObject[2];
		gameobjects[0] = player;
		gameobjects[1] = menu;
		
		for (GameObject obj : gameobjects) { //for every obj in gameobjects, do something
			obj.draw();
		}
		//GameObject gameobject = new GameObject();
		//error: Cannot instantiate the type GameObject
		//abstract classes exist to be extended, they can not be instantiated
	}

}
