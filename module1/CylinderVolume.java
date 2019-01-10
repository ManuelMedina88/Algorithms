package module1;

import java.util.Scanner;

public class CylinderVolume {

	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		double volume = 0;
		
		double radius = 0;
		
		double height = 0;
		
		System.out.println("\n\nAlgorithm to calculate the Cylinder's Volume\n\n");
		
		System.out.print("Enter the cylinder's radius: ");
		radius = scan.nextDouble();
		
		System.out.print("Enter the cylinder's height: ");
		height = scan.nextDouble();
		
		volume = Math.PI * Math.pow(radius, 2) * height;
		
		System.out.printf("The cylinder's volume is equals to: %.2f cubit units\n\n", volume);
	}
}
