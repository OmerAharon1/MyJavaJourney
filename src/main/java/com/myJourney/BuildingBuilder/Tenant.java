package com.myJourney.BuildingBuilder;

import java.util.Random;

public class Tenant {
	Random r1 = new Random();
private String name;
private String[] names = {"Omer" ,"Aharon" , "Yehoraz" , "Levi"};
private int age;
public Tenant() {
	name=names[r1.nextInt(4)];
	this.age=setAge(age);

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public int setAge(int age) {
	return age = r1.nextInt(101)+20;
}

@Override
public String toString() {
	return "Tenant [name=" + name + ", age=" + age + "]";
}
}
