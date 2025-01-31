package day15;

import day10.classobject;

class SSS {
	void mm1(int a) {
		System.out.println(a);
	}

	void mm2(int b) {
		System.out.println(b);
	}}

	class fff extends SSS {
		void mm1(int a) {
			System.out.println(a * a); //overriding

		}

		void mm2(int a,int b) {  //overloading
			System.out.println(a+b);
		}
	}

public class overloadingvsoverriding {

	public static void main(String[] args) {

		fff ghj = new fff();
		ghj.mm1(2);
		ghj.mm2(23, 23);
		ghj.mm2(3);
		
		
	}

}