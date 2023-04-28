package com.compras.site;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class ProdutoDTO {

    @NotNull
    @Size(min = 1, max = 100)
    private String nome;

    @NotNull
    @Size(min = 1, max = 500)
    private String descricao;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal preco;

    @NotNull
    @Min(0)
    private Integer quantidade;

    public ProdutoDTO(String nome, String descricao, BigDecimal preco, Integer quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    public Produto toModel(){

        Produto produto = new Produto(this.nome,this.descricao, this.preco, this.quantidade);
        return produto;
    }


}