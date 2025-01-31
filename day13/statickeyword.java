package day13;

public class statickeyword {

	static int a=10;
	int b=20;
	static void yum1()
	{
		System.out.println("static yum1");
	}
	
	void yum2()
	{
		System.out.println("non static yum2");
	}
	
	public static void main(String[] args) {

		System.out.println(a);
		yum1();
		statickeyword ty = new statickeyword();
		System.out.println(ty.b);
		ty.yum2();

	}

}
