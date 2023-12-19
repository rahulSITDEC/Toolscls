package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample_class {

	public static void main(String[] args) {
		
		Set<Object> s= new HashSet<Object>();
		s.add("Nandhini");
		s.add(35);
		s.add(100);
		s.add("Shai");
		
		Iterator<Object> itr = s.iterator();
		while(itr.hasNext()) {
			
			Object item = itr.next();
			
			 {
				itr.remove();
				
			}
			
		}
		
		System.out.println("******************** AFTER REMOVING DATA***************");
		System.out.println(s);
		
		
		
	}
	
}
