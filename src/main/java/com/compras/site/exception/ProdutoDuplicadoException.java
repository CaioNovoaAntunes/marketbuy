package com.compras.site.exception;

public class ProdutoDuplicadoException extends RuntimeException{
    public ProdutoDuplicadoException(String mensagem){
        super(mensagem);
    }
}
