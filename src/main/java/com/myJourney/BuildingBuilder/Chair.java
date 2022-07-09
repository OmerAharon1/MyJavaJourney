package com.myJourney.BuildingBuilder;

import java.util.Random;

public class Chair extends Furniture{
private int legs;
Random r1 =new Random();
public Chair() {
	super();
	setLegs(legs);
}

public int getLegs() {
	return legs;
}

public void setLegs(int legs) {
	legs=r1.nextInt(3)+3;
	try {
		validatedAmount(legs, 3);
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.legs = legs;
}

@Override
public String toString() {
	return "Chair [legs=" + legs + "]";
}
}
