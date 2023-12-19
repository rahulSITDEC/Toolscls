package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class New_IteratorPrac {
	

	
	public static void main(String[] args) {
	
		List<Object> l= new ArrayList<Object>();
		l.add(12);
		l.add("Indira");
		l.add("Swamy");
		l.add("Rahul");
		l.add(23.456);
		l.add(98789989);
		
		ListIterator<Object> list = l.listIterator();
		
	 		 System.out.println("********************FORWARD**********************");
			
			while(list.hasNext()) {
				System.out.println(list.next());
			}
			  System.out.println("********************BACKWARD**********************");
				
			  while(list.hasPrevious()) {
					System.out.println(list.previous());
				}	
			
				System.out.println("********************REMOVING INDIRA IN ITERATOR**********************");
				while(list.hasNext()) {
					if(list.next().equals("Indira")) {
						list.remove();
					}
								}
	System.out.println(l);
	}
	

}
