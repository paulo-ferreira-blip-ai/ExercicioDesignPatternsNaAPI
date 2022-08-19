package com.api.aplicandoPatterns.model.calculoRecebimento;

import com.api.aplicandoPatterns.model.PagamentoModel;
import com.api.aplicandoPatterns.model.RecebimentoModel;

import java.math.BigDecimal;

public interface CalculoRecebimento {
    public BigDecimal recebimentoFactory(RecebimentoModel recebimentoModel);
}
