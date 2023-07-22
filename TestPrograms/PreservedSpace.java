package TestPrograms;

public class PreservedSpace {
//reversing the sentence based on their lengths
	public static void main(String[] args) {
		String s="Good things take time";
		char[] c=s.toCharArray();
		char[] res=new char[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
				res[i]=' ';
		}
		
		int j=res.length-1;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
			if(res[j]==' ')
				j--;
			res[j]=c[i];
			j--;
			}
		}
		
System.out.println(String.valueOf(res));
	}

}
