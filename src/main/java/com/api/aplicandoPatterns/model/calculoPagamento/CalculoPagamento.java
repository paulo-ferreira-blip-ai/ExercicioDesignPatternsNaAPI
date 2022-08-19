package com.api.aplicandoPatterns.model.calculoPagamento;

import com.api.aplicandoPatterns.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamento {
    public BigDecimal pagamentFactory(PagamentoModel pagamentoModel);
}
