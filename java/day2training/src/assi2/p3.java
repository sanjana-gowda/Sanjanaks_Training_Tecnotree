package assi2;
import java.util.Scanner;

public class p3 {

	

		

				    double radius;
				    double diameter;
				    double area;
				    
				 
				    public p3(double radius) {
				        this.radius = radius;
				    }
				    
				  
				    public void calculateDiameter() {
				        diameter = radius * 2;
				        System.out.println("Diameter of the circle is: " + diameter);
				    }
				    
				   
				    public void calculateArea() {
				        area = Math.PI * radius * radius;
				        System.out.println("Area of the circle is: " + area);
				    }
				    
				 
				    public static void main(String[] args) {
				        Scanner scanner = new Scanner(System.in);
				        System.out.print("Enter the radius of the circle: ");
				        double radius = scanner.nextDouble();
				        p3 circle = new p3(radius);
				        circle.calculateDiameter();
				        circle.calculateArea();
				        scanner.close();
				    }
				


			




	}


