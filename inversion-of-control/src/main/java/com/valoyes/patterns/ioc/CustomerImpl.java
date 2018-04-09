package com.valoyes.patterns.ioc;

public class CustomerImpl implements Customer {

	CreditCard creditCard = new CreditCardImpl();
	
	@Override
	public void pay() {
		creditCard.makePayment();
	}

}
