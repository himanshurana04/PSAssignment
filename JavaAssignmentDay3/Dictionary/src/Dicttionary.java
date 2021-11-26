import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Set;

public class Dicttionary {
	Scanner sc=new Scanner(System.in);
	Map<String,String> dict=new HashMap<String,String>();
	public void myDict() {
		dict.put("array","collection of data");
		dict.put("linked list","collection of data with previous element holding address of next");
		dict.put("stack","collection of data as LIFO");
		dict.put("queue","collection of data as LILO");
		dict.put("hashing","Data with same Hashcode are binded together");
		
		Set<String> keys=dict.keySet();
		System.out.println("Search");
		String input=sc.next();
		for(String val:keys) {
		if(input.matches(val.toLowerCase())) {
			System.out.println(dict.get(val));
			return;
		}
		else 
			continue;
	}
	
	
}
}