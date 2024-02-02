package com.java.day1.basics;

public class TaxCalculation {
	// non-static or instance variables
	private int customerId = 123456;
	private String name = "Adam";
	private double salary = 98432;

	// <Access modifier> <return type> method_name(arg1, arg2,..){}

	public void displayDetails() {
		System.out.println("Cust id : " + customerId + " Name is : " + name);
		System.out.println("Salary is: " + salary);
	}

	public double taxPayable() {
		double tax = (salary * 10) / 100;
		return tax;

	}

	public static void main(String[] args) {

		// class name ref-vari = new classname();
		int id;
		TaxCalculation calculation = new TaxCalculation();
		calculation.displayDetails();
		System.out.println(calculation.name);
		double tax = calculation.taxPayable();
		System.out.println("You have to pay " + tax + " as tax");
		
		Scanner scanner = new Scanner(System.in);
		long n = scanner.ne
		
	}

}


// 
