package com.compras.site.controller;

import com.compras.site.Produto;
import com.compras.site.ProdutoDTO;
import com.compras.site.exception.ProdutoDuplicadoException;
import com.compras.site.repository.ProdutoRepository;
import com.compras.site.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    ProdutoRepository produtoRepository;


    @PostMapping
    public ResponseEntity<Void> salvar(@Valid @RequestBody ProdutoDTO produtoDTO) {
        try {
            Optional<Produto> produtoExistente = produtoRepository.findByNome(produtoDTO.getNome());
            if (produtoExistente.isPresent()) {
                throw new ProdutoDuplicadoException("Já existe um produto com o mesmo nome");
            }
            produtoService.salvar(produtoDTO);
            return ResponseEntity.ok().build();
        } catch (ProdutoDuplicadoException e) {
            return ResponseEntity.badRequest().build(); // retorna Bad Request (status 400)

        }
    }
}