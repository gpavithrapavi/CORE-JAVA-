package TestPrograms;

import java.util.*;

public class EmployDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Boss", new Address(12,"Karnool", 22));
		Employee e2 = new Employee(10, "Gopi", new Address(192,"Guntur", 11));
		Employee e3 = new Employee(11, "Ajay", new Address(9123,"Bengalore", 88));
		
		List<Employee> e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		Collections.sort(e);
		
		for(Employee emp:e) System.out.println(emp);

	}

}
