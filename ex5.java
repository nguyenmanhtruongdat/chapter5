package chapter5;
import java.util.*;

class Date{
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date() {} 

	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	
	}


}

class Vacation{
	private int length;
	private Date date;
	private String place;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	public Vacation() {}
	
	public Vacation(int length, Date date, String place) {
		this.length=length;
		this.date=date;
		this.place=place;
	}



	public String toString() {
	
		return " "+this.length+" "+this.length+" "+this.date;
	}

	public void outPut() {
		System.out.println( "Length: " +getLength());
		System.out.println( "Date: " +this.date.getDay() + "/" + this.date.getMonth() + "/" +this.date.getYear() );
		System.out.println( "Place: " +getPlace());

		//System.out.println(place.toString());
		//System.out.println(date.toString());
	
}



}


public class ex5 {

	public static void main(String[] args) {
		Date date = new Date(27, 6, 2003);
		Vacation vacation = new Vacation(1000, date, "Da Nang");
		vacation.outPut();
	}

}
