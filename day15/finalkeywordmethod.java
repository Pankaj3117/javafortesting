package day15;


class test1 {
	void m1() {
		System.out.println("method on one class");
	}
}

class test2 extends test1 {
	void m1() {
		System.out.println("method on two class");
	}
}

public class finalkeywordmethod {

	public static void main(String[] args) {
		test2 tt = new test2();
		tt.m1();

	}

}
