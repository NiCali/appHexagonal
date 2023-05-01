package com.calixto.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;
import com.calixto.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.calixto.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
