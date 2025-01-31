package day4;

import java.awt.desktop.AboutHandler;

public class if_ifelse {

	public static void main(String[] args) {
		
	//	-if
		
int persn_age =23;
if(persn_age >=25) {
	System.out.println("eliglble");
}else {
		System.out.println("not eligible");
	}

//-if else

int as=10;
if(as%2==0) 
{
	System.out.println("even");
	
}else {
	System.out.println("odd");
}
int avs=9;
if(avs>10) 
{
	System.out.println("postive");
	
}else if(avs<11)
{
	System.out.println("negtive");

}
else {
	System.out.println("Zero");
}

int d=20,f=410,g=78;
if (d>f&&d>g) {
	System.out.println("d is greater "+d);
	
}else if (f>d&&f>g) {
	System.out.println("f is greater "+f);
	
}else if (g>f&&g>d) 
	
 {
	System.out.println("g is greater "+g);
}

//-nested if else

int weeknum=5;
if(weeknum==1)
{
	System.out.println("Monday");
}else if (weeknum==2) {
	System.out.println("tuesday");
}else if (weeknum==3) {
	System.out.println("wed");
}else if (weeknum==4) {
	System.out.println("thurus");
}else if (weeknum==5) {
	System.out.println("fir");
}else if (weeknum==6) {
	System.out.println("sat");
}else if (weeknum==7) {
	System.out.println("sunday");
	
}else {
	System.out.println("enter correct week number");
}

//-switch case

int week=1;
switch(week)
{
case 1: System.out.println("minday");
break;
case 2: System.out.println("sunday");
break;

}

	}
}