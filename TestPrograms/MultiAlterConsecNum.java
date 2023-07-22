package TestPrograms;

public class MultiAlterConsecNum {

	public static void main(String[] args) {
		int[] a= {2,5,0,1,7,2,1,4};
		int p=0;
		for(int i=0;i<=a.length-3;i=i+3)
			p=p+(a[i]*a[i+2]);
		System.out.println(p);

	}

}
