package TestPrograms;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any two strings");
		String s1=scn.next();
		String s2=scn.next();
		System.out.println(isAnagram(s1,s2));

	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		while(true) { 
			if(s1.length()!=s2.length())
				return false;
			if(s1.length()==s2.length())
			{	
				char ch=s1.charAt(0);
				s1=s1.replace(ch,' ');
				s2=s2.replace(ch,' ');
				
				
			}
			return true;
				
		}
	}
}
	


