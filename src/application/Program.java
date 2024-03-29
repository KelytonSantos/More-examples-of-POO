package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("\nArea: %.2f", rectangle.area());
		System.out.printf("\nPerimeter: %.2f", rectangle.perimeter());
		System.out.printf("\nAreDiagonal: %.2f", rectangle.diagonal());
		
		sc.close();
	}

}
