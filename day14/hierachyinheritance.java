package day14;

class Parent {

	void display(int a1) {
		System.out.println(a1);
	}

}

class child1 extends Parent {

	void show(int b1) {

		System.out.println(b1);
	}

}

class child2 extends Parent {
	void show1(int c1) {

		System.out.println(c1);
	}

	
public class hierachyinheritance {

	public static void main(String[] args) {

		child2 cc3 = new child2();		
		cc3.show1(11);
		cc3.display(22);
	}


	
}}
