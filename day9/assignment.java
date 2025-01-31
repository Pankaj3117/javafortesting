package day9;

import java.io.NotActiveException;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1.Check string is palindrome or not

		String r = "See";
		String re = "";
		System.out.println("before reverse " + r);
		for (int i = r.length() - 1; i >= 0; i--) {
			re = re + r.charAt(i);
		}
		System.out.println("after reverse " + re);
		if (re == r) {
			System.out.println("its palindrome");

		} else {
			System.out.println("its not palidrome");

		}

//2.remove junk or special character in string

        String ty = "Pan#ka!j";
		System.out.println("Before remove junk = " + ty);
		System.out.println("after removed junk = " + ty.replace("#", "").replace("!", ""));

	//3.How to remove white spaces in a string
		
		String yt="Pa n k aj";
		System.out.println("Before spaces removed = "+yt);
		System.out.println("After spaces removed = "+yt.replace(" ",""));
		
		//4Count Occurrences of a character in a string
       Scanner uy = new Scanner(System.in);
      String er= uy.next();
		
		String yu = er;
		System.out.println(yu);
		int fd=yu.length();
		int df=yu.replace("a", "").length();
		int count = fd-df;
		System.out.println(count);
		
		
		
		//5.Count words in a string
		  Scanner sc = new Scanner(System.in);
	      String s= sc.nextLine();
	      int countt=1;
	      int i;
	      for(i=0;i<s.length()-1;i++);
	      {
	    	if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				
			}
{
				countt++;
			} 
System.out.println(count);
	    	}}}
	
	
	
	
	