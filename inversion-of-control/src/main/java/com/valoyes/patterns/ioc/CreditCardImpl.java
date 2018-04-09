package com.valoyes.patterns.ioc;

public class CreditCardImpl implements CreditCard{

	@Override
	public void makePayment() {
		System.out.println("Payment made");
	}
}
