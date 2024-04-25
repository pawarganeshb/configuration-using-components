package com.tek.teacher.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tek.teacher.Order;

@Configuration
@ComponentScan(basePackages = {"com.tek.*","com.infosys.*"})
public class BeanConfiguration {

	@Bean("order1")
	public Order getOrderInstace() {
		Order or = new Order();
		or.setOrderID("order23232");
		return or;
	}

	// Configuring Order Object again
	@Bean("order2")
	public Order getOrderInstaceTwo() {
		return new Order();
	}

	// Configuring Order Object again
	@Bean("order3")
	public Order getOrderInstaceThree() {
		return new Order();
	}

}
