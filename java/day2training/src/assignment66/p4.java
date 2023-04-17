package assignment66;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		


				        Queue<String> queue = new LinkedList<>();
				        Scanner scanner = new Scanner(System.in);

				        while (true) {
				            System.out.println("Enter 1 to add item to queue, 2 to remove item from queue, or 3 to exit:");
				            int choice = scanner.nextInt();

				            switch (choice) {
				                case 1:
				                    System.out.println("Enter item to add to queue:");
				                    String itemToAdd = scanner.next();
				                    queue.add(itemToAdd);
				                    System.out.println("Current contents of queue: " + queue);
				                    break;

				                case 2:
				                    if (queue.isEmpty()) {
				                        System.out.println("Queue is empty!");
				                    } else {
				                        String itemToRemove = queue.remove();
				                        System.out.println("Removed item from queue: " + itemToRemove);
				                        System.out.println("Current contents of queue: " + queue);
				                    }
				                    break;

				                case 3:
				                    System.out.println("Exiting program...");
				                    scanner.close();
				                    System.exit(0);
				                    break;

				                default:
				                    System.out.println("Invalid choice, please enter 1, 2, or 3.");
				                    break;
				            }
				        }
				    }
				



	}


