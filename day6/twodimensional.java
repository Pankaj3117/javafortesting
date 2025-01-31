package day6;

import day5.forloop;

public class twodimensional {

	public static void main(String[] args) {
int a[][]=new int[3][2];
//int s[][]= {{677,899}}; another way
a[0][0]=600;
a[0][1]=300;
a[1][0]=200;
a[1][1]=100;
a[2][0]=100;
a[2][1]=100;
System.out.println(a.length);
System.out.println(a[0].length);
System.out.println(a[1][0]);
	for(int ra=0;ra<=a.length-1;ra++)
	{
		for(int rc=0;rc<=a[rc].length-1;rc++)
{
	System.out.println(a[ra][rc]);
}
	}
	}
	

}
