package TestPrograms;

import java.util.Scanner;

public class Balayya {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any number");
		int n=scn.nextInt();
		int temp1=0;
		int temp2=0;
		while(n>0)
		{
			int s1=n%10;
			if(s1%2==0)
				temp1=temp1+s1;
			else
				temp2=temp2+s1;
			n=n/10;
				
				
		}
		if(temp1==temp2)
			System.out.println("Balayya Number");
		else
			System.out.println("Not a Balayya number");

	}

}
