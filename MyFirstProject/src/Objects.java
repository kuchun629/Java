import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int number = 5;
		
		JFrame window = new JFrame(); //window variable that holds JFrame object, creating a new JFrame variable to assign to our variable
		
		//create our window
		window.setVisible(true); //calling method on JFrame object to configure it
		window.setSize(800, 600);		
		window.setTitle("My Window"); 
		
		JLabel label = new JLabel(); //label variable that holds JFrame object, creating a new JFrame variable to assign to our variable
		label.setText("My label"); //calling the setText method on our JLabel object to set its text property 
		
		window.add(label); //calling the add method of our JFrame object to add our label to the window 
		
		//create a string object
		String s = "hi";
		//s.  //to search method on our object "s"
	}
}
