package project;
import java.util.*;


public class CollectionsList {
	public static void main(String args[]) {	
				
		List<String> names = new ArrayList<>();			
		
//		Collection names = new ArrayList<>();	
		
		names.add("Bhagya");
		names.add("Anagha");
		names.add("Uttam");
		names.add("2");
		names.add("Suhas");
		names.add("Kushboo");
		names.add("Vinay");			
		
		System.out.println(names);	
		names.set(2, "New");
		System.out.println(names);	
//		System.out.println(names);	
//		String name = names.get(2);
//		System.out.println(name);
		
		
		List list2 = new ArrayList();
		list2.add("Vinay");
		list2.add(1215710);
		list2.add(25.02);	
		
		System.out.println(list2);	
		
//		for(int i=0;i<list2.size(); i++) {
//			System.out.println(list2.get(i));
//		}		
		
//		System.out.println(list2.get(2));
//		
//		Object o = list2.get(1);
//		System.out.println(o);	
		
//		list2.set(0, "Java");
//		System.out.println(list2);
		
		list2.remove(0);
		System.out.println(list2);	
		
		list2.clear();
		System.out.println(list2);
		
		if(names.contains("Vinay"))
			System.out.println("Bad guy");
		
//		for(String str:names)
//			System.out.println(str);
		
//		Iterator<String> itr = names.iterator();
//		
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		

		
		
		
	
		
	}

}
