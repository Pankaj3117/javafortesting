package day11;

public class typesofcontructor {
	
	int x;
	int y;
	
	typesofcontructor()
	{
		x=100;
		y=200;
	}
	
	typesofcontructor(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void sum() {
	System.out.println(x+y);
	
	
	}
	
	
	

	public static void main(String[] args) {

		
		typesofcontructor er= new typesofcontructor();
		typesofcontructor er1= new typesofcontructor(10,20);

		er.sum();
		er1.sum();

		
	}

}
