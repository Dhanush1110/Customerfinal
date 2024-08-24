package com.lodgemanagment.app.repository;

import com.lodgemanagment.app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer,Long> {
}
