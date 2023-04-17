package assignment66;
import java.util.HashMap;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		


				        HashMap<String, String> dictionary = new HashMap<>();
				        Scanner scanner = new Scanner(System.in);

				        // Add initial words and meanings to the dictionary
				        dictionary.put("apple", "a fruit that is red or green and round");
				        dictionary.put("book", "a set of written or printed pages, bound together");
				        dictionary.put("computer", "an electronic device for storing and processing data");

				        // Display options to the user
				        System.out.println("1. Look up a word");
				        System.out.println("2. Add a word and its meaning");
				        System.out.println("3. Exit");

				        int option = scanner.nextInt();

				        while (option != 3) {
				            if (option == 1) {
				                System.out.print("Enter a word: ");
				                String word = scanner.next();

				                if (dictionary.containsKey(word)) {
				                    System.out.println(dictionary.get(word));
				                } else {
				                    System.out.println("Sorry, that word is not in the dictionary.");
				                }
				            } else if (option == 2) {
				                System.out.print("Enter a word: ");
				                String word = scanner.next();
				                System.out.print("Enter the meaning of the word: ");
				                String meaning = scanner.next();

				                dictionary.put(word, meaning);

				                System.out.println("The word and its meaning have been added to the dictionary.");
				            } else {
				                System.out.println("Invalid option. Please try again.");
				            }

				            // Display options to the user again
				            System.out.println("1. Look up a word");
				            System.out.println("2. Add a word and its meaning");
				            System.out.println("3. Exit");

				            option = scanner.nextInt();
				        }

				        System.out.println("Goodbye!");
				    }
				



	}


