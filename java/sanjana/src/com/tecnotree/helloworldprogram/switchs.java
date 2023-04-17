package com.tecnotree.helloworldprogram;

import java.util.Scanner;

public class switchs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
		System.out.println("enter the1st number");
	int a=in.nextInt();
		
		System.out.println("enter the 2nd number");
	int b=in.nextInt();
		
		int  d;
		
        System.out.println("1.add,2.sub,3.div");
        int f=in.nextInt();
        switch(f) {
        case 1:d=a+b;
        System.out.println(d);
        break;
        case 2:d=a-b;
        System.out.println(d);
        break;
        case 3:d=a/b;
        System.out.println(d);
        break;
        }
        
	}

}
