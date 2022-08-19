package com.api.aplicandoPatterns.model.calculoRecebimento;

import com.api.aplicandoPatterns.model.RecebimentoModel;

import java.math.BigDecimal;

public class Din_Pix_Cheque implements CalculoRecebimento{
    @Override
    public BigDecimal recebimentoFactory(RecebimentoModel recebimentoModel) {
        return BigDecimal.valueOf(0);
    }
}
