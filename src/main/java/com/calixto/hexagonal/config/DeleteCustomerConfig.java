package com.calixto.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.calixto.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.calixto.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.calixto.hexagonal.application.core.usecase.FindCustomerByIdUseCase;    

@Configuration
public class DeleteCustomerConfig {
    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
    
}
