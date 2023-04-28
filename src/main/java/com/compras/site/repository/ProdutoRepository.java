package com.compras.site.repository;

import com.compras.site.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findByNomeIgnoreCase(String nome);

    Optional<Produto> findByNome(String nome);
}
