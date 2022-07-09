package com.myJourney.ThreadsRace;

import java.util.LinkedList;


public class Run {
	public static void main(String[] args) {
		
Speedy s1 = new Speedy("Mcqueen") ;
Speedy s2 = new Speedy("idk", s1);
s1.setSpeedy(s2);

Thread t1 = new Thread(s1);
Thread t2 = new Thread(s2);




t1.start();
t2.start();
System.out.println((int)(Math.random()*1000));
	LinkedList<String> l1 = new LinkedList<String>();
	l1.add("some");
	l1.add("num");
	l1.add("is");
	l1.add("one");
	
	
		System.out.println(l1.toString());
		
	}
	
	
}
