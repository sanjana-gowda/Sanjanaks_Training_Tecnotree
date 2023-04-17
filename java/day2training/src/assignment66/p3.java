package assignment66;
import java.util.Scanner;
import java.util.TreeSet;



public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				

				        // create a new TreeSet object to store the set of integers
				        TreeSet<Integer> intSet = new TreeSet<Integer>();

				        // create a new Scanner object to read input from the user
				        Scanner scanner = new Scanner(System.in);

				        // loop until the user chooses to exit
				        while (true) {
				            // display options to the user
				            System.out.println("Welcome to the integer set!");
				            System.out.println("1. Add an integer");
				            System.out.println("2. Remove an integer");
				            System.out.println("3. Display the set");
				            System.out.println("4. Exit");
				            System.out.println("Enter your choice: ");

				            // read the user's choice
				            int choice = scanner.nextInt();

				            // add an integer
				            if (choice == 1) {
				                System.out.println("Enter an integer to add: ");
				                int num = scanner.nextInt();
				                intSet.add(num);
				                System.out.println(num + " added to the set.");
				            }
				            // remove an integer
				            else if (choice == 2) {
				                System.out.println("Enter an integer to remove: ");
				                int num = scanner.nextInt();
				                if (intSet.contains(num)) {
				                    intSet.remove(num);
				                    System.out.println(num + " removed from the set.");
				                } else {
				                    System.out.println("Sorry, " + num + " is not in the set.");
				                }
				            }
				            // display the set
				            else if (choice == 3) {
				                System.out.println("Current set: " + intSet);
				            }
				            // exit the program
				            else if (choice == 4) {
				                System.out.println("Goodbye!");
				                break;
				            }
				            // invalid choice
				            else {
				                System.out.println("Invalid choice. Please try again.");
				            }
				        }
				    }
				


	}


