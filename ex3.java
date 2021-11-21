package chapter5;
import java.awt.Color;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;

class Mobile{
	private String ownerName;
	private Color color;
	private String number;
	private String model;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Mobile(String ownerName, Color color, String number, String model) {
		this.ownerName=ownerName;
		this.color=color;
		this.number=number;
		this.model=model;
	}
	
		
	
public void printInfor() {
		
		System.out.println("Owner name: " +this.getOwnerName());
		System.out.println("Color: " +this.getColor());
		System.out.println("Number: " +this.getNumber());
		System.out.println("Model: " +this.getModel());
		
		
	}
	
	public String toString(){  
		  return ownerName+" "+color+" "+number +" "+model;
		  
	}

}

public class ex3 {

	public static void main(String[] args) {
		Color color = new Color(255, 255, 255);
		Mobile mobile = new Mobile("Truong Dat", color, "0332919xxx", "Iphone 100");
		mobile.printInfor();
		
		
	}

}
