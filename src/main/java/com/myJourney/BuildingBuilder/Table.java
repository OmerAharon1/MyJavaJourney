package com.myJourney.BuildingBuilder;

import java.util.Random;

public class Table extends Furniture {
Random r1 = new Random();
private int legs;
private String shape;
private int depth;
private String[] shapes= {"Circle" , "Square" , "Rectangle"};

public Table() {
	super();
	shape=shapes[r1.nextInt(3)];
	setDepth(depth);
	
	
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
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}
public int getDepth() {
	return depth;
}
public void setDepth(int depth) {
	depth=r1.nextInt(10)+30;
	try {
		validatedAmount(depth, 30);
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.depth = depth;
}
@Override
public String toString() {
	return "Table [legs=" + legs + ", shape=" + shape + ", depth=" + depth + "]";
}
}
