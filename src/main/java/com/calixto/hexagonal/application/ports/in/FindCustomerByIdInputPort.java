package com.calixto.hexagonal.application.ports.in;

import com.calixto.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);    
}
