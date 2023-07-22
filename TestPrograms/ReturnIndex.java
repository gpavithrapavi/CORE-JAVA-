package TestPrograms;

import java.util.*;

public class ReturnIndex {

	public static void main(String[] args) {
		String s="Just go to hell";
		Map<Character, String> m=new HashMap<>();
		String s1=" ";
		for(int i=0;i<s.length();i++) {
			
			char c=s.toUpperCase().charAt(i);
			if(m.containsKey(c))
				m.put(c, m.get(c)+","+i);
				else {
					 s1=s1+(c);
			         m.put(c, i+"");
				}
		  }
			Set<Character> set=m.keySet();
			for(Character c:set)
			{
				System.out.println(c+"="+m.get(c));
			}
			
		}
		
			
		}

	


