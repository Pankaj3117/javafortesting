package day7;

import java.util.Arrays;

public class printarrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,44,55,2,444};
System.out.println(Arrays.toString(a));
Arrays.sort(a);
for( int i=a.length-1;i>=0;i--)
{

System.out.println(a[i]);

	}

}
}