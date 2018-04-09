package com.valoyes.patterns.ioc;

import org.springframework.stereotype.Component;

//la anotacion component dice a Spring que en runtime esta clase puede ser creada o 
//debe ser creada, de modo que pueda ser utilizada en otra clases
@Component
public class CreditCardImpl implements CreditCard{

	@Override
	public void makePayment() {
		System.out.println("Payment made");
	}
}
