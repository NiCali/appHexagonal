package com.calixto.hexagonal.application.ports.out;

public interface SendCpfForVAlidationOutpuPort {
    void send(String cpf);
}
