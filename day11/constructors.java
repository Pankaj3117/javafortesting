package day11;

public class constructors {
	
	int sid;
	String name;
	char gr;
	
	void print()
	{
		System.out.println(sid+name+gr);
	}
	void print1(int id,String nm , char r)
	{
	
		sid=id;
		name=nm;
		gr=r;
		
	}

	constructors(int id,String nm,char r){
		sid=id;
		name=nm;
		gr=r;
		
	}
	

}
