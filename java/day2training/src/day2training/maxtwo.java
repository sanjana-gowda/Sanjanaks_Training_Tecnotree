package day2training;
import java.util.Scanner;

public class maxtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();
		        
		        double max = (num1 > num2) ? num1 : num2;
		        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + max);
		    }
		


	}


