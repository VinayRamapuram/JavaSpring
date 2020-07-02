package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

	int salary;
	String name;
	String department;
	int emp_id;
	int current_max_salary = 0;

	public Employee(int salary, String name, String department, int emp_id) {
		this.salary = salary;
		this.name = name;
		this.department = department;
		this.emp_id = emp_id;
	}

	public String name() {
		return name;
	}

	public int salary() {
		return salary;
	}

	public String department() {
		return department;
	}

	public int emp_id() {
		return emp_id;
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(50000, "vinay", "Develper", 1215710));
		emps.add(new Employee(30000, "somene", "Tester", 1215712));
		emps.add(new Employee(60000, "ItsYu", "HR", 234356));
		emps.add(new Employee(20000, "Me", "Manager", 232621));
		
		

		for (Employee obj : emps) {
			int max_salary = obj.salary();
//			if (max_salary > current_max_salary)
			System.out.println("Name:" + obj.name() + "  Salary:" + obj.salary());

			/*
			 * if(obj.salary > max_salary) { max_salary = obj.salary; Employee emplye_obj =
			 * obj; }
			 */ 

		}
		
//		Employee maxSal = Collections.max(emps);
	}

}
