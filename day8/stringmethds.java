package day8;

import java.util.Arrays;

public class stringmethds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Length
		String s="hello";
		int l =	s.length();
			System.out.println(l);
			System.out.println(s.length());
			System.out.println("welcome".length());
			//concat
			String r="hey";
			String r2="hey2";
			String r3="hey3";
			System.out.println(r+r2+r3);
			System.out.println(r.concat(r2).concat(r3));
			//trim
			String e="  Pankaj   ";
			System.out.println("before trmin"+e.length());
			System.out.println(e);
			System.out.println("After trim"+e.trim().length());
		
			//charAt
			s="Pankaj";
			System.out.println(s.charAt(2));
			
			//contain return true or false
			
			s="neha";
			System.out.println(s.contains("ha"));
			System.out.println(s.contains("pankaj"));
			
			//equal() and equalsIgnoreCase() = compare string
			
		String	s1="Pnkj";
		String	s2="pnkj";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
			
			//replace()
		
		s1="Welcome to selenium java selenium";
		 System.out.println( s1.replace('e', 'a'));
		 System.out.println( s1.replace("selenium", "C##"));
			
			//substring
		 
		 s1="selenium";
		 System.out.println(s1.substring(1,5));
		 
		 String d="Pankaj";
		 d.toUpperCase();
		 d.toLowerCase();
		 System.out.println(d.toUpperCase());
		 System.out.println(d.toLowerCase());
		 
		 //split
		 
		String  s6="pankgarg3117@gmail.com";
		 String a[]=s6.split("@");
		 System.out.println(Arrays.toString(a));
		 System.out.println(a[0]);
		 System.out.println(a[1]);

		 String amount="$15,20,55";
		System.out.println(amount.replace("$","").replace(",",""));	
        
		//split
		String o="asd,765@gmail";
		String arr1[]=o.split(",");
		 System.out.println(Arrays.toString(arr1));
		 String arr2[]=arr1[1].split("@"); 
		 System.out.println(Arrays.toString(arr2));
		 System.out.println(arr1[0]);
		 System.out.println(arr2[0]);
		 System.out.println(arr2[1]);


		 String name="Pnkj Deepika";
		 System.out.println(name.replace('P', 'p').contains("pnkj"));
		 
		 
	}

}
