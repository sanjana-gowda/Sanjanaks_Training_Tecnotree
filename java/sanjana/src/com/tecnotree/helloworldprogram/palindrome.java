package com.tecnotree.helloworldprogram;

public class palindrome {
	
	public static void main(String[] args) {
		int num=12021,reverse=0,rem,temp;
		
		temp=num;
		while (temp!=0)
		{
			rem=temp%10;
			reverse=reverse*10+rem;
			temp/=10;
		};
		
		if(num==reverse)
			System.out.println(num+"is palindrome");
		else
			System.out.println(num+"not palindrome");
		}
	}


