package com.calixto.hexagonal.application.ports.out;

import com.calixto.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
