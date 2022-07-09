package com.myJourney.BuildingBuilder;

import java.util.Random;

public class Furniture {
Random r1=new Random();
private int height;
private int width;
public Furniture() {
	setHeight(height);
	setWidth(width);
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	height=r1.nextInt(30)+1;
	try {
		validatedAmount(height, 1);
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.height = height;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	width=r1.nextInt(30)+1;
	try {
		validatedAmount(width, 1);
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.width = width;
}
public void validatedAmount(int amount , int min) throws Exception {
	if(amount<min) {
		throw new Exception();
	}
}
@Override
public String toString() {
	return "Furniture [height=" + height + ", width=" + width + "]";
}
}
