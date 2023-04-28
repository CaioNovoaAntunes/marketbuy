package com.compras.site.controller;

import com.compras.site.Produto;
import com.compras.site.ProdutoDTO;
import com.compras.site.repository.ProdutoRepository;
import com.compras.site.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody ProdutoDTO produtoDTO) {
        produtoService.salvar(produtoDTO);
        return ResponseEntity.ok().build();
    }
}