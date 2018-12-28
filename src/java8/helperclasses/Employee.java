package java8.helperclasses;

import java.util.Comparator;

public class Employee {

	private int id;
	private String name;
	private String address;
	private double sal;

	public Employee(int id, String name, String address, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}

	public static int compareBySal(Employee e1, Employee e2) {
		return new Integer(e1.id).compareTo(new Integer(e2.id));

	}

}
