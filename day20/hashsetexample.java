package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class hashsetexample {

	public static void main(String[] args) {
//Declaration
		HashSet mySet = new HashSet();
		// Set mySet2=new HashSet();
		// HashSet<String> mySet=new HashSet<String>();
		mySet.add(100);
		mySet.add(10.5);
		mySet.add("Pkj");
		mySet.add(100);
		mySet.add(null);
		mySet.add(false);
		mySet.add(null);
		System.out.println(mySet);
		// remove
		mySet.remove("Pkj");
		System.out.println(mySet);
		// Insert not possible
		// access specfic element-not possible
		// covert hashset to arrayset
		ArrayList al = new ArrayList(mySet);
		System.out.println(al);
		System.out.println(al.get(2));
		for (Object x : mySet) {
			System.out.println(x);
System.out.println("Itrater proces-----");
			Iterator it = mySet.iterator();
			while (it.hasNext()) {
		
				
		System.out.println(it.next());
		mySet.clear();
		System.out.println(mySet);
		System.out.println(mySet.isEmpty());
			
			
			}
	}

	}}
