package com.calixto.hexagonal.adapters.out;
import com.calixto.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.calixto.hexagonal.application.core.domain.Address;

import com.calixto.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.calixto.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.calixto.hexagonal.adapters.out.client.response.AddressResponse;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {
    
    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;
    
    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode){        
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}