package com.calixto.hexagonal.application.ports.in;

import com.calixto.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
