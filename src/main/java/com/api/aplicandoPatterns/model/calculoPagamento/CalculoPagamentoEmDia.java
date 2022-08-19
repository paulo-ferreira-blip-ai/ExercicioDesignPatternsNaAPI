package com.api.aplicandoPatterns.model.calculoPagamento;

import com.api.aplicandoPatterns.model.PagamentoModel;

import java.math.BigDecimal;

public class CalculoPagamentoEmDia implements CalculoPagamento {

    @Override
    public BigDecimal pagamentFactory(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValorAPagar().subtract(pagamentoModel.getDiferencaValor());
    }
}
