package TestPrograms;

import java.util.Arrays;

public class SepZeroAndOnes {

	public static void main(String[] args) {
//		int[] a = {0,0,1,1,0,1,1,0,1};
//		int[] temp=new int[a.length];
//		for(int i=0;i<a.length;i++)
//			if(a[i]==1) {
//				temp[i]=a[i];
//				System.out.print(temp[i]);
//			}
//		for(int i=0;i<a.length;i++)
//			if(a[i]==0) {
//				temp[i]=a[i];
//				System.out.print(temp[i]);
//			}
//		
				
		
		int[] a= {0,1,0,1,1,1,1,1,1,0,1,0,0,1};
		//System.out.println(Arrays.toString(a));
		
		int i=0,j=a.length-1;
		while(i<j)
		{
			while(a[i]==0)i++;
			while(a[j]!=0)j--;
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
				
			}
		}
		System.out.println(Arrays.toString(a));
	
	}

}
