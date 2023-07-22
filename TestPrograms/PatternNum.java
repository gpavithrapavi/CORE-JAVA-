package TestPrograms;

public class PatternNum {

	public static void main(String[] args) {
		int n=5;
		int v=1;
	
		for(int i=n;i>=1;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.println(" ");
				for(int j=1;j<=i;j++)
				{
					if(i%2!=0)
						System.out.print(v++);
					else
						System.out.print(--v);
				}
			
		}

	}

}
