package TestPrograms;

public class FirstLetterInWord {
	
	 public static void main(String[] args) {    
	     String s="Smile makes everything alright";
		 String temp=" ";
		 String [] s1=s.split(" ");
		 for(int i=0;i<s1.length;i++)
		 {
			 temp+=(first(s1[i]));
			 if(i<s1.length-1)
				 temp+=" ";
		 }
		 
		 for(int j=0;j<temp.length();j++)
			 System.out.print(temp.charAt(j));
	 }
		 
	      
	 static String first(String s)
	 {
		 for(int i=0;i<s.length();i++)
		 {
			 if(i==0)
				 return s.charAt(i)+"  ";
			 
		 }
		 
		 return s.length()+" ";
		 
	 
	} 
	}
	
	
		 
		 
	




