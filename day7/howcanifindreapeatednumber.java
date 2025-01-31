package day7;

public class howcanifindreapeatednumber {

	public static void main(String[] args) {
int a[]= {44,56,33,44,66};
int num=44;
int count =0;
for(int value:a) {
	if(value==num) {
		count++;
	}
	
}
		System.out.println(count);
		
	}

}
