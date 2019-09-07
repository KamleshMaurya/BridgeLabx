import java.util.Scanner;

/*
 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula 
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.

 */
public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		double a = sc.nextDouble();
		System.out.println("enter value of b");
		double b = sc.nextDouble();
		System.out.println("enter value of c");
		double c = sc.nextDouble();
		quadratic(a,b,c);
	}
	static void quadratic(double a, double b, double c)
	{
		
	}
}
