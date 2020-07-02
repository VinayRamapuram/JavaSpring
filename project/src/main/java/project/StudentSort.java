package project;

public class StudentSort {
	String name;
	int roll_number;
	String department;
	float grade;
	
	
	public StudentSort(String name,int roll_number,String department, float grade) {
		this.name = name;
		this.roll_number = roll_number;
		this.department = department;
		this.grade = grade;			
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll_number() {
		return roll_number;
	}


	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public float getGrade() {
		return grade;
	}


	public void setGrade(float grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "StudentSort [name=" + name + ", roll_number=" + roll_number + ", department=" + department + ", grade="
				+ grade + "]";
	}



	
	
//	public String toString() 
//    { 
//        return this.roll_number + " " + this.name + 
//                           " " + this.department + " " + this.grade; 
//    } 

}

