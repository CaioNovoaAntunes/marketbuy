package com.compras.site;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    @Size(max = 100)
    private String nome;

    @NotNull
    @Size(max = 500)
    private String descricao;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal preco;

    @NotNull
    @Min(0)
    private Integer quantidade;

}
