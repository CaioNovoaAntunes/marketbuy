package com.compras.site.service;

import com.compras.site.Produto;
import com.compras.site.ProdutoDTO;
import com.compras.site.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void salvar(ProdutoDTO produtoDTO) {
     Produto produto =  produtoDTO.toModel();

        produtoRepository.save(produto);
    }
}
