package TestPrograms;

import java.util.Scanner;

public class LeastNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scn.nextInt();
		int temp=9;
		while(num>0)
		{
			int s=num%10;
			if(s<temp) {
				temp=s;
			}
			num=num/10;
		}
		System.out.println(temp);

	}

}
