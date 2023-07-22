package TestPrograms;

public class SmallestNum {

	public static void main(String[] args) {
		int n=1934;
		int temp=9;
		while(n>0)
		{
			int v=n%10;
			if(v<temp)
			{
				temp=v;
				n=n/10;
			}
		}
		System.out.println(temp);

	}

}
