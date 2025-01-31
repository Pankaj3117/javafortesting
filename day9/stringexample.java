package day9;

import java.nio.channels.NonReadableChannelException;

public class stringexample {

	public static void main(String[] args) {

		
		String r="Welcome";
		String rev="";
	//	char a[]=r.toCharArray();
	for(int i=r.length()-1;i>=0;i--)
	{
		//rev=rev+a[i];
	rev=rev+r.charAt(i);	
	}
	System.out.println(rev);
	

	//approach two using string buffer class
	
	StringBuffer e=new StringBuffer("Welcome");
	StringBuilder t= new StringBuilder("emoclew");
    System.out.println(e.reverse());
    System.out.println(t.reverse());
 
	}
	
	
	
}
