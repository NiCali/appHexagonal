package com.calixto.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.calixto.hexagonal.application.ports.out.SendCpfForVAlidationOutpuPort;

@Component
public class SendCpfValidationAdapter implements SendCpfForVAlidationOutpuPort{

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
    
}
