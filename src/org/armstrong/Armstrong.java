package org.armstrong;

public class Armstrong {

	public static void main(String[] args) {
		int n=1634;
		int dum=n;
		int rem, sum=0;
		while (dum>0) {
			rem=dum%10;
			sum=(int) (sum+(Math.pow(rem, 3)));
			dum=dum/10;
		}
		if (n==sum) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("It is not an Armstrong Number");
		}
			
	}

}
