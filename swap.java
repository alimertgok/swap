package task2a;

public class task2a {
	public static void main(String[] args) {
		// we want to swap x and y
		
		int x = 4; // create a box with the number 4 in it.
		int y = 5; // create a box with the number 5 in it.
		int temp; // create a new box that is empty.
		
		System.out.println("x is "+ x +" and y is "+y); // x is 4 and y is 5
		
		temp = x; // store the x value
		x = y; // swap the x and y value
		y = temp; // get the x value that is stored in temporary box.
		
		System.out.println(" x is "+ x +" and y is "+y);
		
	}

}
