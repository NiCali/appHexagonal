package com.calixto.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.calixto.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.calixto.hexagonal.application.core.domain.Customer;
import com.calixto.hexagonal.adapters.out.repository.CustomerRepository;
import com.calixto.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customEntityMapper;

    @Override
    public void insert(Customer customer){
        var customerEntity = customEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
