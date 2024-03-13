package com.wesleyRabelo.demo.service;

import com.wesleyRabelo.demo.entity.Cliente;
import com.wesleyRabelo.demo.repository.ClienteRepository;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClienteService {
    @Autowired
    private final ClienteRepository repository;

    @Transactional
    public Cliente saveCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> encontrarCliente(Integer id) {
        return Optional.of(repository.findById(id)).orElseThrow(
                () -> new RuntimeException("Erro ao encontrar cliente")
        );
    }
}
