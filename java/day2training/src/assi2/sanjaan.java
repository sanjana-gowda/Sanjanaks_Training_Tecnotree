package assi2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class sanjaan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        String inputFile = "input.csv";
		        String outputFile = "output.csv";
		        
		        try {
		            // Create a new FileWriter object for the output file
		            FileWriter writer = new FileWriter(outputFile);
		            
		            // Create a new BufferedReader object for the input file
		            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		            
		            // Read the first line of the input file, which contains the column headers
		            String line = reader.readLine();
		            
		            // Write the column headers to the output file
		            writer.write(line + ",Average\n");
		            
		            // Read the remaining lines of the input file and calculate the average grade for each student
		            while ((line = reader.readLine()) != null) {
		                // Split the line into an array of strings, using commas as the delimiter
		                String[] data = line.split(",");
		                
		                // Calculate the sum of the grades for the student
		                double sum = 0;
		                for (int i = 1; i < data.length; i++) {
		                    sum += Double.parseDouble(data[i]);
		                }
		                
		                // Calculate the average grade for the student
		                double average = sum / (data.length - 1);
		                
		                // Write the student's name and average grade to the output file
		                writer.write(data[0] + "," + average + "\n");
		            }
		            
		            // Close the BufferedReader and FileWriter objects
		            reader.close();
		            writer.close();
		            
		            // Print a message to indicate that the program has finished successfully
		            System.out.println("Average grades calculated and written to output file.");
		        } catch (IOException e) {
		            // Print an error message if there is an error reading from or writing to the file
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		


	}


