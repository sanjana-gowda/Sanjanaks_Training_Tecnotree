package com.tecnotree.helloworldprogram;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=20,n2=50,gcd;
		while(n1!=n2) {
			if(n1>n2)
				n1-=n2;
			else
				n2-=n1;
			
		}
		System.out.println("the gcd:"+n1);

	}

}
