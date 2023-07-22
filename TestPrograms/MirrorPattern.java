package TestPrograms;

import java.util.Scanner;

public class MirrorPattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no.of lines");
		int n=scn.nextInt();
		int st=1;
		int sc=n+n-2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++)
				System.out.print("*");
			for(int j=1;j<=sc;j++)
				System.out.print(" ");
			for(int j=1;j<=st;j++)
				System.out.print("*");
			
			
			
			if(i<n)
			{
				st=st+1;
				sc=sc-2;
			}
			System.out.println();
				}
	}
}
