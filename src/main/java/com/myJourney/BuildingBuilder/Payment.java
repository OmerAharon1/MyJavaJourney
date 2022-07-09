package com.myJourney.BuildingBuilder;

public class Payment {
private double amount;
private PaymentType paymentType;
public Payment(PaymentType paymentType,double amout) {
	
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	try {
		validateAmount(amount, 100.0);
	} catch (Exception e) {
		e.printStackTrace();
	}
	this.amount = amount;
}
public PaymentType getPaymentType() {
	return paymentType;
}
public void setPaymentType(PaymentType paymentType) {
	this.paymentType = paymentType;
}
public void validateAmount(double Amount, double min) throws Exception {
	if(amount<min) {
		throw new Exception();
		}
}
@Override
public String toString() {
	return "Payment [amount=" + amount + ", paymentType=" + paymentType + "]";
}
}
