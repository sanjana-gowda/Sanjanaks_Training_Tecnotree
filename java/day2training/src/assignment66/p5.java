package assignment66;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				        Set<String> wordSet = new HashSet<>();
				        Scanner scanner = null;

				        try {
				            scanner = new Scanner(new File("C:\\Users\\gowdasa\\OneDrive - Tecnotree\\Documents\\t1.txt"));
				        } catch (FileNotFoundException e) {
				            System.out.println("File not found!");
				            System.exit(0);
				        }

				        while (scanner.hasNext()) {
				            String word = scanner.next().toLowerCase();
				            wordSet.add(word);
				        }

				        scanner.close();

				        System.out.println("Number of unique words in file: " + wordSet.size());
				    }
				


	}


