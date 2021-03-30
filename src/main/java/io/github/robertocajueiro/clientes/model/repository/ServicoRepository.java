package io.github.robertocajueiro.clientes.model.repository;

import io.github.robertocajueiro.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
