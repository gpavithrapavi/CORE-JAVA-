package TestPrograms;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any number");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<i;s++)
				System.out.print("  ");
			for(int j=0;j<n-i;j++)
				System.out.print("* ");
			
			System.out.println();
				
			
		}

		
		
	}

}
