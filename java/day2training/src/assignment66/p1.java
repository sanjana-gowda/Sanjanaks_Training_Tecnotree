package assignment66;
import java.util.ArrayList;
import java.util.Scanner;


public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				


				        ArrayList<String> names = new ArrayList<>();
				        Scanner input = new Scanner(System.in);

				        while (true) {
				            System.out.println("Enter 1 to add a name, 2 to remove a name");
				            int choice = input.nextInt();

				            if (choice == 1) {
				                System.out.println("Enter the name to add:");
				                String name = input.next();
				                names.add(name);
				                System.out.println("Current list of names: " + names);
				            } else if (choice == 2) {
				                System.out.println("Enter the name to remove:");
				                String name = input.next();
				                names.remove(name);
				                System.out.println("Current list of names: " + names);
				            }else {
				                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
				            }
				        }
				    }
				


	}


