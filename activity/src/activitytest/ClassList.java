package activitytest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class ClassList {
	Map<String,String> classList = new HashMap<String,String>();
	public void classList() {
		classList.put("Bob", "A");
		classList.put("Mary","C");
		classList.put("Sarah","B");
		classList.put("Philip", "A");
		classList.put("Gerg","F");
	}
	public void printClassList() {
		Iterator<Entry<String, String>> entries = classList.entrySet().iterator();
		while(entries.hasNext()) {
		Entry<String, String> entry = entries.next();
		System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	public void printClassList2() {
		for(Map.Entry<String, String> entry : classList.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		for (String Key : classList.keySet()) {
			System.out.println("Key = " + Key);
		}
		
		for (String value : classList.values()) {
			System.out.println("Value = " + value);
		}
	}
	public static void main(String[] args) {
		ClassList myClassList = new ClassList();
		myClassList.printClassList();
	}
	}
