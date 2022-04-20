package com.xworkz.commerce.dto;

import java.io.Serializable;

import com.xworkz.commerce.constants.CustomerType;

public class CustomerDTO implements Serializable {

	private int id;
	private String name;
	private int customerId;
	private long mobile;
	private long alternativeMobile;
	private String email;
	private CustomerType customerType;
	private String alternativeEmail;
	private AddressDTO addressDTO;
}
