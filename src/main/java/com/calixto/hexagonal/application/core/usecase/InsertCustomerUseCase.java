package com.calixto.hexagonal.application.core.usecase;

import com.calixto.hexagonal.application.core.domain.Customer;
import com.calixto.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.calixto.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.calixto.hexagonal.application.ports.out.SendCpfForVAlidationOutpuPort;
import com.calixto.hexagonal.application.ports.in.InsertCustomerInputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort{
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfForVAlidationOutpuPort sendCpfForVAlidationOutpuPort;    

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort, SendCpfForVAlidationOutpuPort sendCpfForVAlidationOutpuPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForVAlidationOutpuPort = sendCpfForVAlidationOutpuPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForVAlidationOutpuPort.send(customer.getCpf());
    }
}
