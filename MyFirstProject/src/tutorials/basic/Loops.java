package tutorials.basic;

public class Loops {

	public static void main(String[] args) {
		//System.out.println("1");
		//System.out.println("2");
		//System.out.println("3");
		//System.out.println("4");
		//System.out.println("5");
		//System.out.println("6");
		//System.out.println("7");
		//System.out.println("8");
		//System.out.println("9");
		//System.out.println("10");
		
		//whileLoop()
		int counter1 = 0;
		while (counter1 < 10) {
			counter1 = counter1 + 1;
			System.out.println(counter1);
		}
		
		//doWhileLoop()
		doWhileLoop();
		
		//forLoop()
		forLoop();
	}
	
	static void doWhileLoop() {
		int counter2 = 10;
		do {
			counter2 = counter2 + 1;
			System.out.println(counter2);
		} while(counter2 < 10);
	}
	
	static void forLoop() {
		//for(initialising counter3; condition to run the loop; actions on counter3)
		for(int counter3=0; counter3 < 10; counter3 = counter3 + 1) {
			System.out.println(counter3);
		}
		//the action would be added to the very end (after print)
	}
}

//Why does the Eclipse debugger open up random classes when debugging?

//"F5" Step into: An action to take in the debugger. If the line does not contain a function
//it behaves the same as “step over” but if it does the debugger will enter the
//called function and continue line-by-line debugging there.

//"F6" Step over: An action to take in the debugger that will step over a given line. If the 
//line contains a function the function will be executed and the result returned without 
//debugging each line.
