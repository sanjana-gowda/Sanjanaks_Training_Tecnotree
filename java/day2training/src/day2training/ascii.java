package day2training;
import java.util.Scanner;


public class ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a character: ");
		        char c = scanner.next().charAt(0);
		        
		        int asciiValue = (int) c;
		        System.out.println("The ASCII value of " + c + " is " + asciiValue);
		    }
		


	}


