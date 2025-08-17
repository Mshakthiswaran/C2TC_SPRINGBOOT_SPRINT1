package com.tnsif.data_JPA_mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tnsif.data_JPA_mapping.dto.OrderResponse;
import com.tnsif.data_JPA_mapping.entity.Customer;

public interface CustomerRepositoory extends JpaRepository<Customer, Integer>  {
	 @Query("SELECT new com.tnsif.data_JPA_mapping.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
	    public List<OrderResponse> getJoinInformation();
}
