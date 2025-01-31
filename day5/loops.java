package day5;

import java.awt.print.Printable;

public class loops {

	public static void main(String[] args) {
		//example1 Printable 1...10		
		
		int w=1;
		while(w<=3)
		{
		System.out.println(w);
		w++;
	}
		//example 2 - print hello 10 times
		int ne=1;
		while(ne<=3) {
			System.out.println("hello");
			ne++;
			
		}
		//example 3 print even number between 1 to 10
		
		int r=2;
		while(r<=10) {
			System.out.println(r);
			r+=2;
			}
		
		//example 1...10 print odd even
		int rw=1;
		while(rw<=10) {
			if(rw%2==0) {
				System.out.println(rw+"even");
				
			}else  {
				System.out.println(rw+"odd");
				
			}
			rw++;
			}
		
		//example5 10....1
		
		int fd=10;
		while(fd>0) {
			System.out.println(fd);
			fd--;
		}
		
		
		
		
		}
}
