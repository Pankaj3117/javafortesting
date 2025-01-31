package day18;

import java.util.Scanner;

import day16.interfacee;

public class uncheckedexception {

	public static void main(String[] args) {
		System.out.println("started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		try {
		System.out.println(100/num);
		}
		catch(Exception A)
		{
			System.out.println(A);
		}
		finally {
			System.out.println("Finally executed");
		}
		System.out.println("complete");
		System.out.println("exist");
	}

}
