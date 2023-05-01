package com.calixto.hexagonal.adapters.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.calixto.hexagonal.adapters.out.client.response.AddressResponse;

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "${calixto.client.address.url}"
)
public interface FindAddressByZipCodeClient {
    @GetMapping("/{zipCode}/json")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}