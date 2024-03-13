package com.wesleyRabelo.demo.controller;

import com.wesleyRabelo.demo.entity.Cliente;
import com.wesleyRabelo.demo.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.OptionalInt;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pratica")
public class ClienteController {
    private final ClienteService service;

    @PostMapping("/criar")
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        service.saveCliente(cliente);
        return ResponseEntity.status(201).body(cliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> findById(@PathVariable Integer id){
        Optional<Cliente> cliente = service.encontrarCliente(id);
        return ResponseEntity.status(201).body(cliente);
    }
}
