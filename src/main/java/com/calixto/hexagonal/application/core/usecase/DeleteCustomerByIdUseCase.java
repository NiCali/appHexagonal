package com.calixto.hexagonal.application.core.usecase;

import com.calixto.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.calixto.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.calixto.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort{
    
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;  
    
    private final DeleteCustomerByIdOutputPort deleteCustomerOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                 DeleteCustomerByIdOutputPort deleteCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerOutputPort = deleteCustomerOutputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerOutputPort.delete(id);
    }
}
