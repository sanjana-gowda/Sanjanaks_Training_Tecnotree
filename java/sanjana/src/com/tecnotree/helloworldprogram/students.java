package com.tecnotree.helloworldprogram;
import java.util.Scanner;

public class students {

	public static void main(String[] args) {
		
		
		        String[] names = new String[10];
		        int[] ages = new int[10];
		        char[] genders = new char[10];
		        

		        // Loop to enter details for each student
		        for (int i = 0; i < 2; i++) {
		            Scanner input = new Scanner(System.in);
		            System.out.println("Enter details for student " + (i + 1) + ":");
		            System.out.print("Name: ");
		            names[i] = input.nextLine();
		            System.out.print("Age: ");
		            ages[i] = input.nextInt();
		            input.nextLine(); // consume the remaining newline character
		            System.out.print("Gender (M/F): ");
		            genders[i] = input.nextLine().charAt(0);
		           // consume the remaining newline character
		        }

		        // Loop to display details for each student
		        for (int i = 0; i < 2; i++) {
		            System.out.println("Details for student " + (i + 1) + ":");
		            System.out.println("Name: " + names[i]);
		            System.out.println("Age: " + ages[i]);
		            System.out.println("Gender: " + genders[i]);
		        }
		    }
		}

		
		       
