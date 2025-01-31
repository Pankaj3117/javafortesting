package day10;


public class classobjectmain {

	public static void main(String[] args) {
		classobject emp1 = new classobject();
		emp1.eid = 101;
		emp1.ename = "kim";
		emp1.job = "QA";
		emp1.sal = 100000;
		emp1.display();
		
		System.out.println(emp1.eid);

		classobject emp2 = new classobject();
		emp2.eid = 102;
		emp2.ename = "kin";
		emp2.job = "QC";
		emp2.sal = 20000;
		emp2.display();

	}

}
