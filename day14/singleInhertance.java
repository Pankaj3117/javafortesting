package day14;

class a{
	
	int a=100;
	void display() {
		System.out.println(a);
	}
	
}
class b extends a    {
	
	int b=200;
	void show() {
		System.out.println(b);
	}
	
}

public class singleInhertance {

	public static void main(String[] args) {

		b obj = new b();
		System.out.println(obj.a);

		obj.display();
		obj.show();
		
	}

}
