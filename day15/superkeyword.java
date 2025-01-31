package day15;

class animal{
	String color="white";

	void eat() {
		System.out.println("eating nothing");
	}
}

class dog extends animal{
	String color="Black";

	void display()
	{
		System.out.println(super.color);
	}
	 void eat() {
		System.out.println("eating bread");
		super.eat();
	}
	
}
public class superkeyword {
	

	public static void main(String[] args) {

		dog see = new dog();
		see.display();
		see.eat();
		
	}

}
