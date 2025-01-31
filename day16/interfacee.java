package day16;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

interface shape {
	int lenght = 10;
	int weidth = 20;

	void circle();

	default void square() {
		System.out.println(lenght + weidth);
	}

	static void react() {
		System.out.println("this is react");
	}
}

public class interfacee implements shape

{
	 public void circle() {
		System.out.println("abstarct");
	}

	public static void main(String[] args) {
		interfacee trr=new interfacee();
		trr.circle(); //abstract
		trr.square(); //default
		shape.react(); //static method can directly access from interface
	}

}
