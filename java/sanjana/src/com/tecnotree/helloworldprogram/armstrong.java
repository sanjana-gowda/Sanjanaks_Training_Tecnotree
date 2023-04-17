package com.tecnotree.helloworldprogram;

		import java.util.Scanner;

		public class armstrong{ 
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();
		        
		        int sum = 0;
		        int originalNumber = number;
		        int digits = String.valueOf(number).length();
		        
		        while (number > 0) {
		            int digit = number % 10;
		            sum += Math.pow(digit, digits);
		            number /= 10;
		        }
		        
		        if (originalNumber == sum) {
		            System.out.println(originalNumber + " is an Armstrong number.");
		        } else {
		            System.out.println(originalNumber + " is not an Armstrong number.");
		        }
		        
		        sc.close();
		    }
		

	}


