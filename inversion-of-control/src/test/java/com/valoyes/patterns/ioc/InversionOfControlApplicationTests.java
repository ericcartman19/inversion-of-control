package com.valoyes.patterns.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InversionOfControlApplicationTests {

	@Autowired
	Customer customer;
	
	@Test
	public void testPayment() {
		 customer.pay();
	}

}
