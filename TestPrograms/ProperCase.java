package TestPrograms;

public class ProperCase {
	public  static String upper(String s) {
		char[]c=s.toCharArray();
		String s1="";
		s1+=c[0];
		s1=s1.toUpperCase();
		
		for(int i=1;i<c.length;i++) {
			
			s1+=c[i];
		}
		return s1;
	}

	public static void main(String[] args) {
		String s="AbcdE efghi Jklm opqrst ";
		//char[] ch =s.toCharArray();
		String []ch=s.split(" ");
		String s2="";
		for(int i=0;i<ch.length;i++)
		{
		 
			s2+=upper(ch[i]);
			s2+=" ";
			
		}
		System.out.println(s2);
		
		

	}

}
