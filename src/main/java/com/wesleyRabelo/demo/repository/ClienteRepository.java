package com.wesleyRabelo.demo.repository;

import com.wesleyRabelo.demo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
