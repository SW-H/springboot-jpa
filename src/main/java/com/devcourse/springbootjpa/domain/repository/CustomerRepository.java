package com.devcourse.springbootjpa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcourse.springbootjpa.domain.order.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
