package tutorials.basic;

public class Arrays {

	public static void main(String[] args) {
		int x; //creating that one box in memory that stores one int value
		int[] myArrays; //declaring an array that will store ints
		myArrays = new int[4]; //initializing our array to be capable of holding 4 ints
		
		/*
		 leave comments
		 */
		x = 5;
		
		myArrays[0] = x;
		myArrays[1] = 3;
		myArrays[2] = 0;
		myArrays[3] = 1; 
		
		//System.out.println(myArrays[1]);
		
		//iterating over an array
		for (int i = 0; i < myArrays.length; i++) {
			System.out.println(myArrays[i]);
		}
		
		//for every number in myArrays, do something
		for (int number : myArrays) {
			System.out.println(number);
		}
		
		//the power of array
		int[] myArrays2;
		myArrays2 = new int[50000]; 
		//myArrays2. //array is actually an object, so can see a list of methods that we can call on this object
		
		for (int j = 0; j < myArrays2.length; j++) {
			myArrays2[j] = j + 1;
			System.out.println(myArrays2[j]);
		}
		
		int[] myArrays3;
		myArrays3 = new int[] {1,2,3,4,5,6,7,8,9,10};
		for (int counter : myArrays3) { //for every counter in myArrays3
			System.out.println(counter); //print out myArrays3[counter]
		}
		
	}
			
}
