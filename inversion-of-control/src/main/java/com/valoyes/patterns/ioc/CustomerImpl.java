package com.valoyes.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// la anotacion component dice a Spring que en runtime esta clase puede ser creada o 
// debe ser creada, de modo que pueda ser utilizada en otra clases
@Component
public class CustomerImpl implements Customer {

	// al marcar un campo como @Autowired Spring buscara dicha clase y creara un objeto de la misma 
	// y lo injectar'a, siempre y cuando la clase a inyectar este marcada con la annotation @Autowired
	// si en este caso hacemos @Autowired de una interface, Spring es capaz de encontrar una implementacion
	// de esta interface
	// @Autowired
	CreditCard creditCard;
	
	@Override
	public void pay() {
		creditCard.makePayment();
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	// now using Setter @Autowired
	@Autowired
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
