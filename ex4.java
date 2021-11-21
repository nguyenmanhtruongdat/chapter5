package chapter5;

import java.util.Scanner;

class Salary{
	
public Salary(){}


	private double sum;
	private int month;
	private double tax;
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
			
public Salary(double sum, int month, double tax) {
	this.sum=sum;
	this.month=month;
	this.tax=tax;
}

	public void Output() {
		
		System.out.println("Sum = " +this.getSum());
		System.out.println("Month = " +this.getMonth());
		System.out.println("Tax = " +this.getTax());
		
		Salary output = new Salary();
		
		
	}

	public String toString(){  
		  return sum+" "+month+" "+tax;
		  
	}

	
	
}

public class ex4 {

	public static void main(String[] args) {
		Salary salary = new Salary(60.5, 5, 0.5);
		salary.Output();
		salary.toString();
	}

}
