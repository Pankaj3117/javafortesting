package day17;

import day16.interfacee;

public class dataconversion {

	public static void main(String[] args) {
		//String to integer
		String s = "1235";
		String s1 = "123";
		System.out.println(Integer.parseInt(s) + Integer.parseInt(s1));
		//String to boolean
		String s2="true";
		System.out.println(Boolean.parseBoolean(s2));
		
		//int,double,boolean,char to String
		
		int a=10;
		double b=10.6;
		char c='A';
		boolean bb=true;
		System.out.println(String.valueOf(a));
		
		
		
		
		
	}

}
