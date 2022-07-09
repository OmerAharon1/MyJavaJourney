package com.myJourney.BuildingBuilder;

public class Floor {
private int floorNumber;
private Apartment[] apartments;

public Floor(int floorNumber) {
	this.floorNumber=floorNumber;
	this.apartments= generateApartment(apartments);
}

public int getFloorNumber() {
	return floorNumber;
}

public void setFloorNumber(int floorNumber) {
	this.floorNumber = floorNumber;
}

public Apartment[] getApartments() {
	return apartments;
}

public void setApartments(Apartment[] apartments) {
	this.apartments = apartments;
}
public Apartment[] generateApartment(Apartment[] apartments) {
	apartments = new Apartment[4];
	for(int i = 0 ; i <apartments.length;i++) {
		apartments[i]=new Apartment((floorNumber*4)+(i-3));
	}
	return apartments;
}

@Override
public String toString() {
	System.out.println("floor " + floorNumber + " contains apartments " + ((floorNumber*4)-3) + " - " + floorNumber*4 );
	for(int i = 0 ; i < apartments.length; i++) {
		apartments[i].toString();
	}
	return "";
}
}
