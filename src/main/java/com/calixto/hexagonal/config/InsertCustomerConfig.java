package com.calixto.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.calixto.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.calixto.hexagonal.adapters.out.InsertCustomerAdapter;
import com.calixto.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.calixto.hexagonal.application.core.usecase.InsertCustomerUseCase;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
        FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
        InsertCustomerAdapter insertCustomerAdapter,
        SendCpfValidationAdapter sendCpfValidationAdapter
        ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
