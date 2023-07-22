package TestPrograms;

public class AddingNumsInString {
				
	public static void main(String[] args) {
		String s="3Pavi 23 Si727vi 11 ";
		String num="";
		int sum=0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0'  &&   c[i]<='9')
				num=num+c[i];
			else
			{
				if(num!="")
				{
					sum+=Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println(sum);

	}

}
