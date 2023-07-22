package TestPrograms;

public class MatrixRotation {

	public static void main(String[] args) {
		
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
		
		public static void rotate(int[][] m)
		{
		int n=m.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				  int temp=m[i][j];
				m[i][j]=m[j][i];
				m[j][i]=temp;
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n/2;j++)
			{
				int  temp=m[i][j];
				m[i][j]=m[i][n-j-1];
				m[i][n-j-1]=temp;
				
			}
		}
		}
}

		

	

