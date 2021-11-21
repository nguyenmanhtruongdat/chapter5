package chapter5;
import java.util.*;

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


class Rectangle2D{
	private double width;
	private double length;
	private Point2D center;
	
	public Point2D getCenter() {
		return center;
	}
	public void setCenter(Point2D center) {
		this.center = center;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	


public Rectangle2D() {}

public Rectangle2D(double width, double length, Point2D center) {
	this.width=width;
	this.length=length;
	this.center=center;
}


public double Area() {
	
	System.out.println("The area of rectangle = " + (width*length));
	return width*length;
	
}

public double Perimeter() {

	System.out.println("The perimeter of rectangle = " +(width+length)*2);
	return (width+length)*2;
	
}
	
public void Display() {
	
	System.out.println("Center = " +"("+this.center.getX()+", "+this.center.getY()+")" );
}
	
}


public class ex1 {

	public static void main(String[] args) {
	
	Point2D point2d = new Point2D(5, 10);
	Rectangle2D rectangle = new Rectangle2D(5, 10, point2d);
	rectangle.Area();
	rectangle.Perimeter();
	rectangle.Display();
	
	
	
	
	
	
	}

}

