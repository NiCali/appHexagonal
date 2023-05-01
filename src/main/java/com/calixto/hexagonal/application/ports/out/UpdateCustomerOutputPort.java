package com.calixto.hexagonal.application.ports.out;

import com.calixto.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    
    void update(Customer customer);

}
