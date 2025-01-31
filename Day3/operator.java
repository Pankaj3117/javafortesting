package Day3;

public class operator {

	public static void main(String[] args) {
		//1) Arithmetic---- + - * / %
		int a=10,b=20;
		System.out.println("sum of a and b is "+(a+b));
		System.out.println("subtract of a and b is "+(b-a));
		System.out.println("multi of a and b is "+(a*b));
		System.out.println("divi of a and b is "+(b/a));
		System.out.println("modulo of a and b is "+(a%b));
	//	2) Relational---> >= < <= != ==
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		//3) Logical---&& || !
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1);
		boolean b2=11>10;
		System.out.println(b2);
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		
	//	4) Increment and decrement---++ --
		//Increment
		int q=10;
		System.out.println(q);
		//q=q+1;
		q++;
		System.out.println(q);
		
		int w=13;
		System.out.println(w);
		//q=q+1;
		int rtr=++w;
		System.out.println(w);
		System.out.println(rtr);
		
		//decrement
		int f=43;
		System.out.println(f);
		//q=q+1;
		f++;
		System.out.println(f);
		
		int wg=13;
		System.out.println(wg);
		//q=q+1;
		int rre=wg--;
		System.out.println(wg);
		System.out.println(rre);
		
		
		//5) assignment---+= -= *= /= %=
		
		int u=20;
		u+=5;
		System.out.println(u);
		
		int j=20;
		j*=5;
		System.out.println(j);
		
	//	6) conditional/Ternary operator---?:
		
		int cv=300,fd=500;
		int df = (cv<fd)? cv:fd;
		System.out.println(df);
		
		int gf =(1==1)?100:200;
		System.out.println(gf);
		int grf =(2==1)?100:200;
		System.out.println(grf);
		
	}

}
