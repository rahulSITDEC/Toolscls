package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {
public static void main(String[] args) {
	
	List<String> l= new ArrayList<String>();
	System.out.println("Enter values");
	Scanner sc= new Scanner(System.in);
	String item = sc.next();
	l.add(item);
	l.add("Dhoni");
	l.add("Sharma");
	System.out.println("The list values are " +l);
	

}
}