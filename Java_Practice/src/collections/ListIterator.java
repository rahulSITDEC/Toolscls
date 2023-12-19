package collections;

import java.util.ArrayList;
import java.util.List;
public class ListIterator {
		
	
	public static void main(String[] args) {		
	
     List<Integer> l= new ArrayList<Integer>();
	
	l.add(10);
	l.add(100);
	l.add(50);
	l.add(150);
	
	
	ListIterator<Integer> lis = l.listIterator<Integer>()

//	Iterator iterato = l.iterator();

	
	System.out.println("\n\n*********************BACKWARD*********************");
	
	while(lis.hasPrevious()) {
		System.out.println(lis.previous());
	}
	
	
	
	
	System.out.println("************FORWARD*******************");
	while(list.hasNext()) {
		System.out.println(list.next());
	}

System.out.println("\n\n*********************BACKWARD*********************");
	
	while(list.hasPrevious()) {
		System.out.println(list.previous());
	}
	

	
//	System.out.println(l);
//	System.out.println("***************FOR LOOP**************");
//	for(int i=0;i<l.size();i++) {
		
//		if(l.get(i)>50) {
//			l.remove(i);
//			i--;
//		}
//		System.out.println(l.get(i));
//	}
	
//	System.out.println("\n\n*****************FOR EACH LOOP***************");
//	for (Integer in : l) {
//		if(in>100) {
//			System.out.println("Index to be removed   "+l.indexOf(in));
//			l.remove(l.indexOf(in));
//		}
//		else System.out.println(in);
//	}
//	
//}
//    System.out.println("\n\n******************REMOVW WITH ITERATOR*******************");
//	Iterator<Integer> it= l.iterator();
//	while(it.hasNext()) {
//		Integer newe = it.next();
//		if(newe>=100) {
//			it.remove();
//		}
//		System.out.println(it.next());
//	}
	
//	System.out.println(l);
//	System.out.println("*************** LIST ITERATOR FORWARD***************");
//     ListIterator<Integer>  m = l.listIterator();
//	while(m.hasNext()) {
//		System.out.println(m.next());
//	}
//	
//	System.out.println("****************LIST ITERATOR BACKWORD************");
//	while(m.hasPrevious()){
//		System.out.println(m.previous());
//	}
	
	}	
	}
	
	
