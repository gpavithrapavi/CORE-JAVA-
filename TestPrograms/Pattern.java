package TestPrograms;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the value of n");
	int n=scn.nextInt();
	int k=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++) {
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++)
		{
			if(i%2==0) {
				System.out.print(k+1+" ");
			k++;
			}
			else
			{
				System.out.print(k+" ");
				k--;
			}
		}
		System.out.println();
	}
	}
}
		
	
	
	



	

	


