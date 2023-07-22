package TestPrograms;

import java.util.Scanner;

public class PrimeSecond {

	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the lower limit");
		int l = scn.nextInt();
		System.out.println("enter the higher limit");
		int u = scn.nextInt();
		int count = 0;
		int i;
		for (i = l; i >= u; i--) {
			if (isPrime(i)) {
				count++;
				
				if (count %2!=0)
					System.out.println(i);
					
			}
		}

	}

}