package TestPrograms;




public class WithoutLenMeth{
	public static void main(String[] args) {
		
	String s=" Just go to hell ";
//	int count=0;
//	for(char c:s.toCharArray()) {
//		count++;
//	}
//	System.out.println(count);
	int count=0;
	StringBuffer sb=new StringBuffer(s);
	while(sb.isEmpty())
	{
		sb.deleteCharAt(0);
		count++;
	}
	System.out.println(count);
	}
}
