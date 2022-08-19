package com.api.aplicandoPatterns.model.calculoRecebimento;

import com.api.aplicandoPatterns.model.RecebimentoModel;

import java.math.BigDecimal;

public class Vale_Refeicao implements CalculoRecebimento{
    @Override
    public BigDecimal recebimentoFactory(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAReceber().multiply(new BigDecimal("0.042"));
    }
}
