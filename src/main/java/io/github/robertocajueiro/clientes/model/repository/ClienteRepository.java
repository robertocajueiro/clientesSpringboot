package io.github.robertocajueiro.clientes.model.repository;

import io.github.robertocajueiro.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
