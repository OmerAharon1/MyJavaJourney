package com.myJourney.BuildingBuilder;


public class Building {
private int buildingNumber;
private Floor[] floors = new Floor[20];

public Building(int buildingNumber) {
	this.buildingNumber=buildingNumber;
	this.floors= generateFloors(floors);
	
}

public int getBuildingNumber() {
	return buildingNumber;
}

public void setBuildingNumber(int buildingNumber) {
	this.buildingNumber = buildingNumber;
}

public Floor[] getFloors() {
	return floors;
}

public void setFloors(Floor[] floors) {
	this.floors = floors;
}

public Floor[] generateFloors(Floor[] floors) {
	for(int i = 0 ; i < floors.length ; i++) {
		floors[i]=new Floor(i+1);
	}
	return floors;
}

@Override
public String toString() {
	System.out.println("Building numer " + buildingNumber + " contains " + floors.length + " floors");
	for(int i = 0 ; i < floors.length; i ++) {
		floors[i].toString();
	}
	return "";
}
}
