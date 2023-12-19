package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Prac {
	public static void main(String[] args) {
		
	
	Map<Integer,String> m = new LinkedHashMap<Integer,String>();
	m.put(3, "Dhoni");
	m.put(4, "Gambhir");
	m.put(2, "Seeshanth");
	m.put(1, "Kohli");
	m.put(5, "Rohit");
	
	Set<Integer> keySet = m.keySet();
	System.out.println("***********Keyvalues************");
	System.out.println(keySet);
	
	
	Collection<String> values = m.values();
	System.out.println("****************ALL Values************");
	System.out.println(m.values());
	 Set<Entry<Integer, String>> gende = m.entrySet();
	
	System.out.println("***********Entry set***********");
	System.out.println(gende);
	
}
}