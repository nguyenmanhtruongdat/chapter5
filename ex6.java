package chapter5;

import javax.swing.text.StyledEditorKit.BoldAction;

class Room{
	
	private int beds;
	private boolean tv;
	private boolean telephone;
	
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	public boolean isTelephone() {
		return telephone;
	}
	public void setTelephone(boolean telephone) {
		this.telephone = telephone;
	}
	
	public Room() {}
	
	public Room(int beds, boolean tv, boolean telephone) {
		
		this.beds=beds;
		this.tv=tv;
		this.telephone=telephone;
	}
	public void outPut() {
		System.out.println("Room: "+"Bed: "+this.getBeds()+", " +"TV: "+  tv +", "+"Telelphone: "+ telephone);
	}

		
}

class Currency{
	
	private String name;
	private double currentDollarRate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCurrentDollarRate() {
		return currentDollarRate;
	}
	public void setCurrentDollarRate(double currentDollarRate) {
		this.currentDollarRate = currentDollarRate;
	}
	
	public Currency() {}
	
	public Currency(String name, double currentDollaRate) {
		
		this.name=name;
		this.currentDollarRate=currentDollaRate;
		
	}
	
}

class Place{
	private String cityName;
	private String countryName;
	private Currency currency;
	private String cityHallTel;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getCityHallTel() {
		return cityHallTel;
	}
	public void setCityHallTel(String cityHallTel) {
		this.cityHallTel = cityHallTel;
	}
	
	public Place() {}
	
	public Place(String cityName, String countryName, Currency currency, String cityHallTel) {
		this.cityName=cityName;
		this.countryName=countryName;
		this.currency=currency;
		this.cityHallTel=cityHallTel;
	}
}

class Hotel{
	
	private Room[] room;
	private String name;
	private Place place;
	
	public Room[] getRoom() {
		return room;
	}
	public void setRoom(Room[] room) {
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}

	public Hotel() {}
	
	public Hotel(Room[] room, String name, Place place) {
		
		this.room=room;
		this.name=name;
		this.place=place;
	}
	
	public String toString() {
		return room+" "+name+" "+place;
	}

	public void outPut() {
		System.out.println("Name: " +this.getName());
		System.out.println("Place: "+this.place.getCityName()+", "+this.place.getCountryName()+", "
		+this.place.getCurrency()+", "+this.place.getCityHallTel());
		System.out.println("Room: "+this.room);
		
		
		
	}
}


public class ex6 {

	public static void main(String[] args) {
        Currency currency = new Currency("Dollar", 0.55);
        Place place = new Place("Da Nang", "Hoa Hai", currency, "0332919872");

        Room room1 = new Room(2, false, false);
        Room room2 = new Room(4, true, true);
        room1.outPut();

        Room[] rooms = new Room[2];
        rooms[0] = room1;
        rooms[1] = room2;

        Hotel hotel = new Hotel(rooms, "Thousand Stars", place);
        hotel.outPut();
        System.out.println(hotel.toString());	
        
	}

}
