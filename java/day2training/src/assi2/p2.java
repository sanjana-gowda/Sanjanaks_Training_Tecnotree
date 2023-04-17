package assi2;
import java.util.Scanner;

public class p2 {

	

		


			    private String name;
			    private int age;
			    private String gender;
			    private int grade;
			    private double GPA;
			    
			    // Constructor
			    public p2(String name, int age, String gender, int grade, double GPA) {
			        this.name = name;
			        this.age = age;
			        this.gender = gender;
			        this.grade = grade;
			        this.GPA = GPA;
			    }
			    
			    // Getters and setters for name
			    public String getName() {
			        return name;
			    }
			    public void setName(String name) {
			        this.name = name;
			    }
			    
			    // Getters and setters for age
			    public int getAge() {
			        return age;
			    }
			    public void setAge(int age) {
			        this.age = age;
			    }
			    
			    // Getters and setters for gender
			    public String getGender() {
			        return gender;
			    }
			    public void setGender(String gender) {
			        this.gender = gender;
			    }
			    
			    // Getters and setters for grade
			    public int getGrade() {
			        return grade;
			    }
			    public void setGrade(int grade) {
			        this.grade = grade;
			    }
			    
			    // Getters and setters for GPA
			    public double getGPA() {
			        return GPA;
			    }
			    public void setGPA(double GPA) {
			        this.GPA = GPA;
			    }
			    
			    // Main method for testing
			    public static void main(String[] args) {
			        Scanner scanner = new Scanner(System.in);
			        
			        // Get user input for name
			        System.out.print("Enter name: ");
			        String name = scanner.nextLine();
			        
			        // Get user input for age
			        System.out.print("Enter age: ");
			        int age = scanner.nextInt();
			        scanner.nextLine(); // consume newline character
			        
			        // Get user input for gender
			        System.out.print("Enter gender: ");
			        String gender = scanner.nextLine();
			        
			        // Get user input for grade
			        System.out.print("Enter grade: ");
			        int grade = scanner.nextInt();
			        scanner.nextLine(); // consume newline character
			        
			        // Get user input for GPA
			        System.out.print("Enter GPA: ");
			        double GPA = scanner.nextDouble();
			        
			        // Create a new student object with the input values
			        p2 student = new p2(name, age, gender, grade, GPA);
			        
			        // Print out the student's properties using the getters
			        System.out.println("Name: " + student.getName());
			        System.out.println("Age: " + student.getAge());
			        System.out.println("Gender: " + student.getGender());
			        System.out.println("Grade: " + student.getGrade());
			        System.out.println("GPA: " + student.getGPA());
			    }
			



	}


