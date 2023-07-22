package TestPrograms;

import java.util.Scanner;

public class Pattrn {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of lines");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int s=1;s<=n-i;s++) 
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
		
	}
}


