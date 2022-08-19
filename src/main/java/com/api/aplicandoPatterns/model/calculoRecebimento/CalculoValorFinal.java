package com.api.aplicandoPatterns.model.calculoRecebimento;

import com.api.aplicandoPatterns.model.RecebimentoModel;

import java.math.BigDecimal;

public class CalculoValorFinal {
    public static BigDecimal valorFinal(BigDecimal valorAPagar, BigDecimal valorDesconto){
        return valorAPagar.subtract(valorDesconto);
    }
}
