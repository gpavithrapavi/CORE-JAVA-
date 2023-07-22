package TestPrograms;

import java.util.Scanner;

public class SumOfPerfectNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the lower range");
		int l=scn.nextInt();
		System.out.println("enter the higher range");
		int u=scn.nextInt();
		int R=0;
		
		for(int i=l;i<=u;i++)
		{
			if(isPerfect(i))
				//System.out.println(i);
				R=R+i;
				
				
		}
		System.out.println("The sum of all perfect numbers are:"+R);

	}
	
	public static boolean isPerfect(int i)
	{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
				sum=sum+j;
				
		}
		if(sum==i)
			return true;
		else
			return false;
		
	}

}
