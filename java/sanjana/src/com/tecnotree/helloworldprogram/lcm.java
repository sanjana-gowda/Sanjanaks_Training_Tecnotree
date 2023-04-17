package com.tecnotree.helloworldprogram;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=16,n2=24,hcf=1;
		
		for(int i=1;i<n1||i<=n2;i++) {
			if (n1%i==0&&n2%i==0)
				hcf=i;
		}
     int lcm=(n1*n2)/hcf;
     System.out.println("the lcm:"+lcm);
	}

}
