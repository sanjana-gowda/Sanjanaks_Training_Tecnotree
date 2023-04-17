package assignment4;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "Hello, World! How are you?";
		        String[] substrings = str.split("[,!? ]+"); // split the string by comma, exclamation mark, question mark, or space

		        System.out.println("Original string: " + str);
		        System.out.println("Substrings:");
		        for (String substring : substrings) {
		            System.out.println(substring);
		        }
		    }
		


	}


