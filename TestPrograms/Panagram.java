package TestPrograms;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any string");
		String s=scn.next();
		
		String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
				
			if(s1.length()!=s.length())System.out.println("not a panagram"); 
			else{
				
				if(s1.contains(s))
					System.out.println("panagram");
			}
					
		//System.out.println("not a panagram");	
			
		}
		
			
		
		
		

	}


