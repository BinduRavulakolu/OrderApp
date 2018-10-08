package com.capgemini.order.exceptions;

public class OrdersNotFoundException extends RuntimeException {
	 public OrdersNotFoundException(String message) {
		   super(message);
	   }
}
