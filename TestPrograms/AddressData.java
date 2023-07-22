package TestPrograms;

import java.util.*;



public class AddressData {

	public static void main(String[] args) {
		List<Addressd> list= new ArrayList<>();
		 list.add(new Addressd(101,"Kuppam","Chittoor"));
		 list.add(new Addressd(201,"","puthoor"));
		 list.add(new Addressd(301,"Chittoor","Kurnool"));

		 Comparator<Addressd> com =(e1,e2)->{
				return e1.getVillageName().compareToIgnoreCase(e2.getVillageName());
			};
			
			Collections.sort(list, com);
			
			for(Addressd p: list) {
				System.out.println(p);
			}
	}

}
