package TestPrograms;

import java.util.Scanner;

public class PallindromeOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
				System.out.println("Enter any value");
				int n=scn.nextInt(); 
				int s=0;
				int temp=n;
				while(n>0)
				{
					int rem=n%10;
					s=(s*10)+rem;
					n=n/10;
				}
			 
				if(s==temp)
					System.out.println("pallindrome");
				else
					System.out.println("not a pallindrome");

	}

}
