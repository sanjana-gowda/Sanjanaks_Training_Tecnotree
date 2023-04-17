package com.tecnotree.helloworldprogram;

import java.util.Scanner;

public class relationoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n1,n2;
		System.out.println("enter the first number:");
		 n1=in.nextInt();
		System.out.println("enter the second number:");
		n2=in.nextInt();
		if(n1>n2) {
			System.out.println(n1+"greater than"+n2);
		}
			else if(n1<n2){
				System.out.println(n1+"lesser than"+n2);
				

		}
			else 
				System.out.println(n1+"equalto"+n2);

	}

}
