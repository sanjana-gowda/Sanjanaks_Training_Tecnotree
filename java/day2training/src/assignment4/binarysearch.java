package assignment4;
import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        // Create an array of strings
		        String[] names = {"Alice", "Bob", "Charlie", "Dave", "Eve"};

		        // Use the Arrays class method binarySearch() to find the index of a specific string in the array
		        int index = Arrays.binarySearch(names, "Charlie");

		        // Print the index of the searched string
		        System.out.println("The index of 'Charlie' in the array is: " + index);
		    }
		


	}


