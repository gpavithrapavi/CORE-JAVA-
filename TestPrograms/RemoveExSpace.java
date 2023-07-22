package TestPrograms;

public class RemoveExSpace {

	public static void main(String[] args) {
		String s="Just go to hell";
		String temp=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
				temp=temp+c;
			else
			{
				 c=s.charAt(i+1);
			if(c==' ')
				temp=temp+c;
			}
				
		}
		System.out.print(temp);
		

	}

}
