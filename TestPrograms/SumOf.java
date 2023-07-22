
package TestPrograms;

import java.util.Scanner;

public class SumOf {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the lower range");
		int l=scn.nextInt();
		System.out.println("Enter the higher range");
		int u=scn.nextInt();
		int sum=0;
		
		for(int i=l;i<=u;i++)
		{
			if(isEven(i))
				//System.out.println("The even numbers are"+i);
				
				sum=sum+i;
		}
		System.out.println(sum);
		}
	
		
	
			
	
	public static boolean isEven(int n)
	{	
		boolean flag=true;
		for(int i=1;i<=n;i++) {
			flag=!flag;
		}
		if(flag)
			return true;
		else
			return false;
		
	}
	


}
