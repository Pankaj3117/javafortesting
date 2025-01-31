package day18;

public class checkedexception {

	public static void main(String[] args) {

	System.out.println("started");
	System.out.println("progress");
	
	try {Thread.sleep(500);
		
	} catch (Exception e) {
System.out.println(e);	}
	
	
	System.out.println("finished");
	System.out.println("existed");		
	}

}
