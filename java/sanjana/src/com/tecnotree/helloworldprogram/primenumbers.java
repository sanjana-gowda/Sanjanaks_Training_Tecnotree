package com.tecnotree.helloworldprogram;
import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of primes to print: ");
		        int n = sc.nextInt();
		        
		        int count = 0;
		        int num = 2;
		        
		        while (count < n) {
		            boolean isPrime = true;
		            
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		            
		            if (isPrime) {
		                System.out.print(num + " ");
		                count++;
		            }
		            
		            num++;
		        }
		        
		        sc.close();
		    }
		

	}


