package TestPrograms;

import java.util.Scanner;

public class SPYNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any number");
		int n=scn.nextInt();
		int sumOfNum=sum(n);
		int mulOfNum=mul(n);
		
		if(sumOfNum==mulOfNum)
			System.out.println("SPY number");
		else
			System.out.println("Not A SPY number");
		
		
		
	}
	
	
	public static int sum(int n)
	{
	int sum=0;
	while(n>0)
	{
		int temp=n%10;
		sum=sum+temp;
		n=n/10;
	}
	return sum;
}
	
	public static int mul(int n)
	{
	int sum=1;
	while(n>0)
	{
		int temp=n%10;
		sum=sum*temp;
		n=n/10;
	}
	return sum;
}

}
