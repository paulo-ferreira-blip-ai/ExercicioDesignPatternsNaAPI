package com.api.aplicandoPatterns.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "recebimentos")
@Data
public class RecebimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status",nullable = false)
    private String status;
    @Column(name = "valor_a_pagar",nullable = false)
    private BigDecimal valorAReceber;
    @Column(name = "valorRecebido")
    private BigDecimal descontoDoCartao;
    @Column(name = "valorFinal")
    private BigDecimal valorFinal;
}

