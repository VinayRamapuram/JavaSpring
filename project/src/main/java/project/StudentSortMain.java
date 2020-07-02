package project;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;

import java.util.* ;

public class StudentSortMain {
	
	private static List<StudentSort> getStudentList(){
		
		List<StudentSort> addStudent = new ArrayList<>();
		
		addStudent.add(new StudentSort("Vinay",12156,"CS", 20.5f));
		addStudent.add(new StudentSort("Bhagya",12161,"EEE", 60.5f));
		addStudent.add(new StudentSort("Anagha",12154,"Mech", 70.5f));
		addStudent.add(new StudentSort("Uttam",12152,"Civil", 80.5f));
		
		return addStudent;
	}
	 

	public static void main(String[] args) {
		
		List<StudentSort> students = getStudentList();
		
//		List<StudentSort> students = new ArrayList<>();
		

//		Collections.sort(students, new SortByName());
		
		
		
		Collections.sort(students, Comparator.comparing(StudentSort::getGrade).reversed());
				
//		Comparator<StudentSort> comparator = (s1, s2) -> s1.getName().compareTo(s2.getName());
//		students.sort(comparator.reversed());			
		
	
		
		for (int i=0; i<students.size(); i++) 
            System.out.println(students.get(i)); 
		

//		Collections.sort((StudentSort s1, StudentSort s2)->s1.getName()-s2.getName());


	}

}

class SortByRoll implements Comparator<StudentSort>{
public int compare(StudentSort a, StudentSort b) 
    { 
        return a.roll_number - b.roll_number; 
    } 
}

class SortByName implements Comparator<StudentSort>{
public int compare(StudentSort a, StudentSort b) 
    { 
        return a.name.compareTo(b.name); 
    } 
}

