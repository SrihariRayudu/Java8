package java8.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java8.helperclasses.Employee;

public class SortEmployees {

	public static List<Employee> empolyeList;
	static {
		empolyeList = new ArrayList<Employee>();
		empolyeList.add(new Employee(11, "srihari", "hyderabad", 1000));
		empolyeList.add(new Employee(32, "satish", "hyderabad", 2000));
		empolyeList.add(new Employee(1, "bhanu", "hyderabad", 3000));
		empolyeList.add(new Employee(12, "jaswanth", "hyderabad", 4000));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empolyeList.forEach(empolyee -> System.out.println(empolyee.toString()));
		System.out.println("==================================================================");
		 Collections.sort(empolyeList, Employee::compareBySal);
			empolyeList.forEach(empolyee -> System.out.println(empolyee.toString()));
	}

}
