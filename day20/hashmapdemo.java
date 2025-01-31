package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import day16.interfacee;

public class hashmapdemo {

	public static void main(String[] args) {

	//Declaration
		
		//HashMap hm = new HashMap();
	//	Map hj = new HashMap();
		HashMap<Integer, String> hy = new HashMap<Integer, String>();
		//Addign pairs
		hy.put(1,"Pnkj");
		hy.put(2,"Neha");
		hy.put(3,"Srma");
		hy.put(4,"Neha");
		hy.put(5,"klaus");
		System.out.println(hy);
		System.out.println(hy.size());
		hy.remove(2);
		System.out.println(hy);
		
		//aceess value
		System.out.println(hy.get(4));
		
		//get all the keys
		System.out.println(hy.keySet());
		System.out.println(hy.values());
		System.out.println(hy.entrySet());
		for (int k:hy.keySet()) {
			System.out.println(k+hy.get(k));
         
	}

}}
