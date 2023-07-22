package TestPrograms;
			//using built in methods
public class RemConsecDup {

	public static void main(String[] args) {
		System.out.println(removeD("BLoolean"));
	}
		
		
		public static String removeD(String s)
		{
			StringBuilder sb=new  StringBuilder();
			for(char c:s.toUpperCase().toCharArray())
			{
				int len=sb.length();
				if(len>0  &&  sb.charAt(len-1)==c)
					sb.deleteCharAt(len-1);
				else
					sb.append(c);
				
					
			}
			return sb.toString();
		}

	

}
