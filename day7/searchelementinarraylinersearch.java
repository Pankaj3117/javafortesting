package day7;

public class searchelementinarraylinersearch {

	public static void main(String[] args) {
		int a[]= {23,21,56,75,33};
		int search = 210;
		boolean status=false;
		for(int i=0;i<a.length-1;i++)
		{
			
			System.out.println(a[i]);
			if(a[i]==search)
			{
				System.out.println("elemnt found");
				status = true;
break;
			}
		}
		if(status==false)
		{
			System.out.println("element is not found");
		}
	}

}
