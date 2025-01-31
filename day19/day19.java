package day19;
import day16.interfacee;

public class day19 {

//Upcasting - coverting values from smaller to larger
//example int to long and float to double
//downcasting - coverting values from larger to smaller
//example long to int and double to float
	public static void main(String[] args) {

		// upcasting -automatic
		int er = 100;
		long ln = er;
		System.out.println(ln);
//downcasting
		
		long lu=100000;
		int ui=(int)lu;
		System.out.println(lu);
	}

}
