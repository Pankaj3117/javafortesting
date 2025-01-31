package day12;

import day9.stringexample;

public class Encapsulation {

	private int acc;
	private String name;
	private	double amount;
	
	void set(int ac) {
		this.acc=ac;
	}
	int get() {
		return acc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
