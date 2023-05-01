package com.calixto.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.calixto.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.calixto.hexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class FindCustomerById {
    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
        FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
