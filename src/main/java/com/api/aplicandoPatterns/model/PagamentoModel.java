package com.api.aplicandoPatterns.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "pagamentos")
@Data
public class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status",nullable = false)
    private String status;
    @Column(name = "valor_a_pagar",nullable = false)
    private BigDecimal valorAPagar;
    @Column(name = "diferenca_valor")
    private BigDecimal diferencaValor;
    @Column(name = "valorPago")
    private BigDecimal valorPago;
}
