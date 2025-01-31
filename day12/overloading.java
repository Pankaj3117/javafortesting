package day12;

public class overloading {

	void main(int x) {
System.out.println(x);
	}

	void main(String s) {

		System.out.println(s);
	}

	void main(String x ,String y)
	{
		System.out.println(x+y);
		
	}

	public static void main(String[] args) {

		overloading ov=new overloading();
		
		ov.main(12);
		ov.main("see");

		ov.main("see ","you");

		
	}

}
