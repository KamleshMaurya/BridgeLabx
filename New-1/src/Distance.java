/*
 * Write a program Distance.java that takes two integer command-line arguments x and y and prints the 
 * Euclidean distance from the point (x, y) to the origin (0, 0). 
 * The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */
public class Distance 
{
	public static void main(String[] args) {
		//take two command line argument 
		int x1 = Integer.parseInt(args[0]);
		int y1 = Integer.parseInt(args[1]);
		//Measure distance from origin (0,0);
		int x2=0,y2=0;
		//calculate distance by using Math.sqrt
		double distance = Math.sqrt(((x1-x2)*(x1-x2))+(y1-y2)*(y1-y2));
		System.out.println(distance);
	}

}
