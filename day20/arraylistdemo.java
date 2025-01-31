package day20;

import java.util.ArrayList;
import java.util.Iterator;

import day16.interfacee;

public class arraylistdemo {

	public static void main(String[] args) {
//Declaration arraylist

		ArrayList myList = new ArrayList();
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		// Adding data into arraylist
		myList.add(100);
		myList.add(10.5);
		myList.add("name");
		myList.add('A');
		myList.add(100);
		myList.add(true);
		myList.add(null);
		int er = myList.size();// Size
		System.out.println(er);
		System.out.println(myList);// Print data
		myList.remove(4); // Remove
		int er1 = myList.size();
		System.out.println(er1);
		System.out.println(myList);
		myList.add(2, "pnkj");
		System.out.println(myList);
		myList.set(2, "neha");
		System.out.println(myList);
		System.out.println(myList.get(2));
		int er2 = myList.size();
		System.out.println(er2);
		// reading all the data
		// using forloop

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		for (Object x : myList) {
			System.out.println(x);

		}
//Using iterator

		Iterator it = myList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// checkingarraylisy empty or not
		System.out.println(myList.isEmpty());

		ArrayList myList2	= new ArrayList();	
		myList2.add(100);
		myList2.add("neha");
		myList.removeAll(myList2);
		System.out.println(myList);
		
		myList.clear();
		System.out.println(myList);
		System.out.println(myList.isEmpty());

	}

}
