package com.myJourney.TripPlanner;
import java.util.Scanner;


public class TripCurrencyCalc {
	public static void main(String [] args) {
	intro();
	
		
	}
	public static void intro() {
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to the Trip Planner!");
	System.out.print("What is you'r name?");
	String name,destination;
	name = input.nextLine();
	
	
	System.out.println("Nice to meet you " + name + " Where are you traveling to?");
	destination = input.next();
	System.out.println("Great ," +destination +" sound like a great trip");
	budget();
	
	}
	public static void budget() {
	Scanner input = new Scanner(System.in);
	int days ,budget ;
	double trans;
	String currencySymbol;
	System.out.println("How many days are you going spent traveling");
	days = input.nextInt();
	System.out.println("how much money in USD are you gonna spend on your trip");
	budget = input.nextInt();
	System.out.println("what is the three latter currency symnol for your travel destination?");
	currencySymbol = input.next();
	System.out.println("How manny " +currencySymbol + "are there in one USD");
	trans = input.nextDouble();		
	System.out.println("if you are travelling for " +days+ " that is the same as " +days*24 + " hours or " + days*24*60 + "minuts");
	System.out.println("if you are going to spend " +budget+ "USD, that means you can spend up to " +budget/days+ "per day" );
	System.out.println("you'r total budget in" +currencySymbol+ "is" +trans*budget+ " witch per day is " + trans*budget/days + currencySymbol +"per day");
	}	
	
	public static void distance() {
		
	}
	
}
	

