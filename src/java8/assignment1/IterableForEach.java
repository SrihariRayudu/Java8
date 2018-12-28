package java8.assignment1;

import java.util.ArrayList;
import java.util.List;

import java8.helperclasses.Employee;

public class IterableForEach {

	public static List<Employee> empolyeList;

	static {

		empolyeList = new ArrayList<Employee>();
		empolyeList.add(new Employee(1, "srihari", "hyderabad", 1000));
		empolyeList.add(new Employee(2, "satish", "hyderabad", 2000));
		empolyeList.add(new Employee(1, "bhanu", "hyderabad", 3000));
		empolyeList.add(new Employee(1, "jaswanth", "hyderabad", 4000));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empolyeList.forEach(empolyee -> System.out.println(empolyee.toString()));

	}

}
