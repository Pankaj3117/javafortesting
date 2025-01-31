package day6;

public class singledimensional {

	public static void main(String[] args) {
int a[]= new int[5];
a[0]=30;
a[1]=36;
a[2]=35;
a[3]=31;
a[4]=36;
//int a[]={23,4,3,3};
System.out.println(a[3]);
System.out.println(a.length);
		
		
	for(int i=0;i<=a.length;i++)
	{
System.out.println(a[i]);
	}
	
	//another way
	for(int x:a)
	{
		System.out.println(x);
	}
	}}
