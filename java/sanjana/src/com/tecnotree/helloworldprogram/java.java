package com.tecnotree.helloworldprogram;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int n1,n2;
       System.out.println("enter the 1st number");
       n1=in.nextInt();
       //System.out.println("enter the 2nd number");
       //n2=in.nextInt();
       if(n1>0) {
			System.out.println(n1+"positive");
		}
			else if(n1<0){
				System.out.println("negative"+n1);
				
				

		}
			else 
				System.out.println("zero");

	}

     	   
	}


