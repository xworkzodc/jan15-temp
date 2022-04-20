package com.xworkz.commerce.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable{

	private int id;// >0 <1000
	private String street;//min 2 , max 100
	private String doorNo;//min 1
	private int pincode;// 6 digits 
	private StateDTO stateDTO;// valid state 
}
