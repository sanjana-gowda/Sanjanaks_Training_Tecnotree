package com.tecnotree.helloworldprogram;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=16;
		int a=0,b=1;
		
		System.out.print(a+","+b+",");
		
		int nextTerm;
		
		for(int i=2;i<num;i++)
		{
			nextTerm=a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm +",");
		}

	}

}
