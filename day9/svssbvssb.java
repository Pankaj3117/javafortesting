package day9;

public class svssbvssb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Immutable
		String d=new String("hey");
		System.out.println(d);
		d.concat("there");
		System.out.println(d);
		
		//String buffer - mutable
		StringBuffer s=new StringBuffer("hey");
		s.append("there");
		System.out.println(s);
		
		//String builder- mutable
		StringBuilder a=new StringBuilder("hey");
		a.append("there");
		System.out.println(a);

	}

}
