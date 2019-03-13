package com.sai.dao;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.sai.model.Customer;

public interface CustomerRepository extends SolrCrudRepository<Customer, String> {
	List<Customer> findByNameEndsWith(String name);
}
