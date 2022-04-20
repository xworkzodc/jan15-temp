package com.xworkz.commerce;

import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.commerce.dto.AddressDTO;
import com.xworkz.commerce.dto.CustomerDTO;
import com.xworkz.commerce.dto.StateDTO;
import com.xworkz.commerce.service.CustomerService;

public class CustomerRunner {

	// team work --->  
	
	public static void main(String[] args) {
		
		CustomerDAO customerDAO=null;// new CustomerDAOImpl();
		
		
		CustomerService customerService=null;//new CustomerServiceImpl(customerDAO);
		
		
		StateDTO stateDTO=null;
		//init all variables		
		AddressDTO addressDTO=null;
		//init all variables
		//addressDTO.setStateDTO(stateDTO);
		CustomerDTO customerDTO=null;
		//init all variables inclusing addressDTO
		//customerDTO.setAddressDTO(addressDTO)
		
		customerService.validateAndSave(customerDTO);
		

	}

}
