package com.xworkz.commerce.dto;

import java.io.Serializable;

public class StateDTO implements Serializable{

	private int id;//>0 < 2000
	private String name;//min 3 , max 40
	private int noOfDistricts; //>0 , <100
}
