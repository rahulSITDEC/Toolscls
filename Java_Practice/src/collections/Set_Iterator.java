package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Iterator {
	


	public static void main(String[] args) {
		Set<String> str= new LinkedHashSet<String>();
		str.add("Modi");
		str.add("Dhoni");
		str.add("Kohli");
		str.add("Rohit");
		str.add("Ashiq");
	
		Iterator<String> it= str.iterator();
		
		System.out.println("********************All set details***********");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(it.);
		  System.out.println("**************** REMOVING DATA USING ITERATOR ****************");	
		  
		  Iterator<String> it1= str.iterator();
			while(it1.hasNext()) {			
				if(it1.next().equalsIgnoreCase("Modi")) {					
					it1.remove();
				}
			}
		
	System.out.println(str);	
		
		
//		System.out.println("**************ITERATOR******************");
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		
	}

}
