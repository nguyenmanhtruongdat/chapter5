package chapter5;
import java.awt.Color;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;

class Point2D{
	private double x;
	private double y;

public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


public Point2D(double x, double y){
	this.x=x;
	this.y=y;
	}

public Point2D() {}

}

class Circle2D {
	
	private double radius;
	private Color color;
	private Point2D center;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Point2D getCenter() {
		return center;
	}
	public void setCenter(Point2D center) {
		this.center = center;
	}
	
	public Circle2D(double radius, Color color, Point2D center) {
		this.radius=radius;		
		this.color=color;
		this.center=center;
	}

	public Circle2D() {}
	
	public void ouPut() {
	System.out.println("Radius : " + this.getRadius());
	System.out.println("Color : " + this.getColor());
	System.out.println("Center: (" + this.center.getX() + ", " + this.center.getY() + ")");
}

	
	

}


public class ex2 {

	public static void main(String[] args) {
		
		Color color = new Color(255, 255, 255);
		Point2D point2d = new Point2D(5, 5);
		Circle2D circle2d = new Circle2D(5.6, color, point2d );
		circle2d.ouPut();
		
		}

}
