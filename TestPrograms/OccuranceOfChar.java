package TestPrograms;



public class OccuranceOfChar {

	public static void main(String[] args) {
		String s="banana";
		int count=0;
		char c1=s.charAt(0);
		while(s.length()>=0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+" ", " ");
			int i=s.length()-s1.length();
			System.out.println(c+"="+i);
			if(i>count) {
			
				count=i;
			c1=c;
				
			
			s=s1;
			}
			else if(i==count && c<c1)c1=c;
			
			
		}
		System.out.println(c1+"="+count);
		

	}

}
