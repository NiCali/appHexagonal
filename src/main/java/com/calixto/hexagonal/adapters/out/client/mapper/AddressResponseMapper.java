package com.calixto.hexagonal.adapters.out.client.mapper;
import org.mapstruct.Mapper;

import com.calixto.hexagonal.adapters.out.client.response.AddressResponse;
import com.calixto.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
