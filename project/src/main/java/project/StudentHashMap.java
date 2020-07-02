package project;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;


public class StudentHashMap {

	
	public static void main(String args[]) {
		
		Map<Integer,StudentSort> unsortedStudentMap = new HashMap<>();
		
		unsortedStudentMap.put(12156, new StudentSort("Vinay",12156,"CS", 20.5f));
		unsortedStudentMap.put(12152, new StudentSort("Uttam",12152,"Civil", 80.5f));
		unsortedStudentMap.put(12161, new StudentSort("Bhagya",12161,"EEE", 60.5f));
		unsortedStudentMap.put(12154, new StudentSort("Anagha",12154,"Mech", 70.5f));	
				
		
		System.out.println("Map beofre Sorting");
//		System.out.println(unsortedStudentMap.get(12154));
		
		for (Map.Entry<Integer,StudentSort> entry : unsortedStudentMap.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		
		
		System.out.println("After sorting ascending order......");
		
		Map<Integer,StudentSort> sortedNewMap = unsortedStudentMap.entrySet().stream().sorted((e1,e2)->
        e1.getValue().getName().compareTo(e2.getValue().getName()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
		
	sortedNewMap.forEach((key,val)->{
		System.out.println(key+ " = "+ val.toString());
		}); 
        
		
//		Set<Integer> keys= studentmap.keySet();
//		
//		for(int each:keys)
//			System.out.println(studentmap.get(each));
				
	}


}

