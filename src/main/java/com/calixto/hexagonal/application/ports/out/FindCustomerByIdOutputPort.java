package com.calixto.hexagonal.application.ports.out;

import java.util.Optional;

import com.calixto.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
