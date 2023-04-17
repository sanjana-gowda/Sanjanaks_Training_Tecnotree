package assi2;
import java.io.*;
import java.util.*;


public class program74 {

	
		    public static void main(String[] args) {
		        // Define the input and output files
		        String inputFile = "grades.csv";
		        String outputFile = "averages.csv";
		        
		        try {
		            // Create the input and output streams
		            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		            
		            // Create a HashMap to store each student's grades
		            HashMap<String, ArrayList<Double>> grades = new HashMap<>();
		            
		            // Read through the input file and store the grades in the HashMap
		            String line;
		            while ((line = reader.readLine()) != null) {
		                String[] tokens = line.split(",");
		                String student = tokens[0];
		                double grade = Double.parseDouble(tokens[1]);
		                
		                if (grades.containsKey(student)) {
		                    grades.get(student).add(grade);
		                } else {
		                    ArrayList<Double> newGrades = new ArrayList<>();
		                    newGrades.add(grade);
		                    grades.put(student, newGrades);
		                }
		            }
		            
		            // Calculate the average grade for each student and write the results to the output file
		            for (String student : grades.keySet()) {
		                ArrayList<Double> studentGrades = grades.get(student);
		                double sum = 0;
		                for (double grade : studentGrades) {
		                    sum += grade;
		                }
		                double average = sum / studentGrades.size();
		                writer.write(student + "," + average + "\n");
		            }
		            
		            // Close the input and output streams
		            reader.close();
		            writer.close();
		            
		            System.out.println("Done!");
		            
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

		


	}


