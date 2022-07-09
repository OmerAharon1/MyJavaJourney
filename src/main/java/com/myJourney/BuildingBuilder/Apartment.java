package com.myJourney.BuildingBuilder;

import java.util.Random;

public class Apartment {
	Random r1 = new Random();
	private int aptNumber;
	private Tenant[] tenants;
	private Payment[] payments;
	private Furniture[] furniture;

	public Apartment(int aptNumber) {
		this.aptNumber = aptNumber;
		this.tenants = generateTenant(tenants);
		this.furniture = generateFurniture(furniture);
		this.payments = generatePayment(payments);
	}

	public int getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}

	public Tenant[] getTenants() {
		return tenants;
	}

	public void setTenants(Tenant[] tenants) {
		this.tenants = tenants;
	}

	public Payment[] getPayments() {
		return payments;
	}

	public void setPayments(Payment[] payments) {
		this.payments = payments;
	}

	public Furniture[] getFurniture() {
		return furniture;
	}

	public void setFurniture(Furniture[] furniture) {
		this.furniture = furniture;
	}

	public Tenant[] generateTenant(Tenant[] tenants) {
		tenants = new Tenant[r1.nextInt(8) + 1];
		for (int i = 0; i < tenants.length; i++) {
			tenants[i] = new Tenant();
		}
		return tenants;
	}

	public Furniture[] generateFurniture(Furniture[] furniture) {
		furniture = new Furniture[10];
		for (int i = 0; i < furniture.length; i++) {
			int a = r1.nextInt(3);
			if (a == 0) {
				furniture[i] = new Chair();
			} else if (a == 1) {
				furniture[i] = new Table();
			} else {
				furniture[i] = new Closet();
			}

		}
		return furniture;

	}

	public Payment[] generatePayment(Payment[] payments) {
		payments = new Payment[5];
		payments[0] = new Payment(PaymentType.HOUSECOMMITTE, HouseCommiteAmount());
		for (int i = 1; i < payments.length; i++) {
			int a = r1.nextInt(3);
			if (a == 0) {
				payments[i] = new Payment(PaymentType.HOUSEHOLD, r1.nextInt(300) + 1);
			} else if (a == 1) {
				payments[i] = new Payment(PaymentType.WATER, r1.nextInt(300) + 1);
			} else {
				payments[i] = new Payment(PaymentType.ELECTRIC, r1.nextInt(300) + 1);
			}
		}
		return payments;
	}
	public String printFurniture(Furniture[] furniture) {
		int chairs = 0 , tables = 0 ,closets = 0;
		for(int i = 0 ; i < furniture.length ; i ++) {
			if (furniture[i] instanceof Chair) {
				chairs++;
			}else if(furniture[i] instanceof Closet){
				closets++;
			}else {
				tables++;
			}
		}
		String a = ("Furnitures are: " + chairs + " chairs " + tables + " tables " + closets + " closets.");
		return a;
	}

	public double HouseCommiteAmount() {
		double a = 100 + ((Math.ceil(aptNumber / 4) - 1) * 10) + ((tenants.length - 1) * 20);
		return a;
	}

	@Override
	public String toString() {
		System.out.println("Apartment " + aptNumber + " contains " + tenants.length + " tenants, and "
				+ furniture.length + " furnitures");
		System.out.println(printFurniture(furniture));
		System.out.println("Apartment " + aptNumber + " houseCommite payment is: " +HouseCommiteAmount());
		return "";
	}
}
