package day9;

import java.util.Arrays;

public class Immutability {

	public static void main(String[] args) {
//mutable
		int a[]= {34,31,56,76};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		//inmutable
		
		String d=new String("hey");
		System.out.println(d);
		d.concat("there");
		System.out.println(d);
	}

}
