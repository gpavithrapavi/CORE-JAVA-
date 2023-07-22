package TestPrograms;

public class ShiftArrayEle {

	public static void main(String[] args) {
			int[] a= {1,2,3,4,5,6};
			int temp[] =new int[a.length];
			int key=2;
			System.arraycopy(a, key, temp, 0,a.length-key);
			//for(int d:temp)System.out.print(d);
			System.arraycopy(a, 0, temp, a.length-key,key );
			//System.out.println();
			for(int d:temp)System.out.print(d);

           }
}
