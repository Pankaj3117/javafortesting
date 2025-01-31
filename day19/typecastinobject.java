package day19;

import day16.interfacee;
import day9.stringexample;

class lion {
	String name = "animals";

	void m1() {
		System.out.println("lion class");
	}
}

class tiger extends lion {
	int h = 2;

	void m2() {
		System.out.println("tiger");
	}
}

public class typecastinobject {

	public static void main(String[] args) {

		tiger t = new tiger();
		System.out.println(t.name);
		System.out.println(t.h);

	}

}
