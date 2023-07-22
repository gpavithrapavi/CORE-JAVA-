package TestPrograms;

public class RotationOfString {

	public static void main(String[] args) {
			System.out.println(rotation( "abcd","cadb"));

	}
	
	public static boolean rotation(String s1, String s2)
	{
		
		if(s1.length()!=s2.length())
		return false;
		
		String p=s1+s1;
		System.out.println(p);
		int x=p.indexOf(s2);
		System.out.println(x);
		if(x==-1)return false;
		
		return true;
		
	}

}
