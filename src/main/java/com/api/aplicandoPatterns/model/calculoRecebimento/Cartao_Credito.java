package com.api.aplicandoPatterns.model.calculoRecebimento;

import com.api.aplicandoPatterns.model.RecebimentoModel;

import java.math.BigDecimal;

public class Cartao_Credito implements CalculoRecebimento{
    @Override
    public BigDecimal recebimentoFactory(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAReceber().multiply(new BigDecimal("0.037"));
    }
}
