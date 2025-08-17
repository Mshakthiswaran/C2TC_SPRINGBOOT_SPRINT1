package com.tnsif.data_JPA_mapping.dto;


import com.tnsif.data_JPA_mapping.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer;

	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	
}