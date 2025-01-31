package day4;

import java.awt.DefaultFocusTraversalPolicy;

public class assignday4 {

	public static void main(String[] args) {
		int e=88,f=78;
		if (e>f) {
			System.out.println("e is larger");
			
		}else 
		{
		System.out.println("f is larger");	
		}

		
		int a=23,v=2,c=1;
		if (a<v&&a<c) {
			System.out.println("a is small");
			
		}else if (v<a&&v<c) {
			System.out.println("v is small");
			
		}else {
			System.out.println("c is samll");
		}
		
		 String week="tues";
		if(week=="sunday")
		{
			System.out.println("1");
		}else if (week=="monday") {
			System.out.println("2");
			
		}else {
			System.out.println("enter correct week number");
		}
		
		String weekn="tues";
		switch(weekn)
		{
		case "sunday": System.out.println("1");
		break;
		case "monday": System.out.println("2");
		break;
		default:System.out.println("enter correct week name");

		}}}