package day15;

import day10.classobject;

class bank{
	 double roi() {
	 return 0;
 }}

class icici extends bank{
	 double roi() {
	 return 10.5;
}
}

class sbi extends bank{
	 double roi() {
	 return 11.5;
}
}

public class overriding {

	public static void main(String[] args) {
		icici cc=new icici();
		System.out.println(cc.roi());
;	}

}
