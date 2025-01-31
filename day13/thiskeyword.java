package day13;

public class thiskeyword {
	int x, y; // class variables
	
	thiskeyword(int x, int y){
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		thiskeyword th=new thiskeyword(1,2);
		th.display();
	}

}
