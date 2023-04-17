package com.tecnotree.helloworldprogram;

public class swaptonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=20;
		
		System.out.println("before swapping the numbers:");
		System.out.println("first number="+a);
		System.out.println("second number="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping the numbers:");
		System.out.println("first number="+a);
		System.out.println("second number="+b);

	}

}
